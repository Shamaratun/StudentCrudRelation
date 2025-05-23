package org.isdb.StudentCrudRelation.service;

import java.util.List;
import java.util.Optional;


import org.isdb.StudentCrudRelation.dao.ClassTeacherProjection;
import org.isdb.StudentCrudRelation.dto.StudentClassDTO;
import org.isdb.StudentCrudRelation.model.StudentClass;
import org.isdb.StudentCrudRelation.model.Teacher;
import org.isdb.StudentCrudRelation.repository.StudentClassRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentClassService {
    private final StudentClassRepository studentClassRepository;
    private final TeacherService teacherService;

    public StudentClassService(StudentClassRepository studentClassRepository, TeacherService teacherService) {
        this.studentClassRepository = studentClassRepository;
        this.teacherService = teacherService;
    }

    public StudentClass saveStudentClass(StudentClassDTO classDTO) {
        Integer teacherId = classDTO.getClassTeacherId();
        Teacher teacher = teacherService.getTeacher(teacherId);
        if (teacher == null) {
            throw new RuntimeException("Teacher not found");
        }
        StudentClass studentClass = new StudentClass();
        studentClass.setName(classDTO.getName());
        studentClass.setRoomNumber(classDTO.getRoomNumber());
        studentClass.setClassTeacher(teacher);

        return studentClassRepository.save(studentClass);
    }

    public StudentClass getStudentClass(Integer id) {
        return studentClassRepository.findById(id).orElse(null);
    }

    public void deleteStudentClass(Integer id) {
        studentClassRepository.deleteById(id);
    }

    public List<StudentClass> getAllStudentClasses() {
        return studentClassRepository.findAll();
    }

    public StudentClass updateStudentClass(Integer id, StudentClassDTO classDTO) {
        Optional<StudentClass> classById = studentClassRepository.findById(id);
        if (classById.isPresent()) {
            StudentClass aClass = new StudentClass();

            if (classDTO.getName() != null) {
                aClass.setName(classDTO.getName());
            }
            if (classDTO.getRoomNumber() != null) {
                aClass.setRoomNumber(classDTO.getRoomNumber());
            }
            if (classDTO.getClassTeacherId() != null) {
                Integer TeacherId = classDTO.getClassTeacherId();
                Teacher teacher = teacherService.getTeacher(TeacherId);
                if (teacher == null) {
                    throw new RuntimeException("Teacher not found");
                }
                aClass.setClassTeacher(teacher);
            }
            return studentClassRepository.save(aClass);
        } else {
            throw new IllegalArgumentException(" Class for student not found");
        }
    }
 // public List<ClassTeacherProjection> getAllClassTeacher() {
    //     return studentClassRepository.getAllClassTeacher();

    // }
    public List<ClassTeacherProjection> getAllClassTeacher() {
        return studentClassRepository.fetchAllClassTeacherRawQuery();
}

}
