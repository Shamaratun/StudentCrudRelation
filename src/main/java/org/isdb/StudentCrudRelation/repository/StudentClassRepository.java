package org.isdb.StudentCrudRelation.repository;


import java.util.List;

import org.isdb.StudentCrudRelation.dao.ClassTeacher;
import org.isdb.StudentCrudRelation.dao.ClassTeacherProjection;
import org.isdb.StudentCrudRelation.dao.ClassTeacherRecord;
import org.isdb.StudentCrudRelation.dto.ClassTeacherDTO;
import org.isdb.StudentCrudRelation.model.StudentClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentClassRepository  extends JpaRepository<StudentClass,Integer>{

 @Query("SELECT sc.name as className, sc.classTeacher.name as TeacherName FROM StudentClass sc ")
 List<ClassTeacherProjection> getAllClassTeacher();


//  @Query("SELECT new org.isdb.StudentCrudRelation.dao.ClassTeacherDTO(sc.name, sc.classTeacher.name as TeacherName) FROM StudentClass sc ")    
//  List<ClassTeacherDTO> fetchAllClassTeacher();

//  @Query("SELECT new org.isdb.StudentCrudRelation.dao.ClassTeacherRecord(sc.name, sc.classTeacher.name) FROM StudentClass sc ")    
//  List<ClassTeacherRecord> fetchAllClassTeacherRecors();
 


}
