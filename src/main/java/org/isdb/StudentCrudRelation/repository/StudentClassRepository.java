package org.isdb.StudentCrudRelation.repository;


import java.util.List;

import org.isdb.StudentCrudRelation.dao.ClassTeacherProjection;
import org.isdb.StudentCrudRelation.model.StudentClass;
import org.isdb.StudentCrudRelation.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentClassRepository  extends JpaRepository<StudentClass,Integer>{

 @Query("SELECT sc.name as className, sc.classTeacher.name as TeacherName FROM StudentClass sc ")
 List<ClassTeacherProjection> getAllClassTeacher();


//  @Query("SELECT new org.isdb.StudentCrudRelation.dao.ClassTeacherDTO(sc.name, sc.classTeacher.name as TeacherName) FROM StudentClass sc ")    
//  List<ClassTeacherDTO> fetchAllClassTeacher();

//  @Query("SELECT new org.isdb.StudentCrudRelation.dao.ClassTeacherRecord(sc.name, sc.classTeacher.name) FROM StudentClass sc ")    
//  List<ClassTeacherRecord> fetchAllClassTeacherRecors();
 
 // Native SQL query to find students by email
// @Query(value = "SELECT * FROM students WHERE email = :email", nativeQuery = true)
// Student findStudentByEmail(@Param("email") String email);
 
 @Query(value = """
			SELECT
			c.NAME AS className,
			t.NAME AS teacherName
			FROM T_CLASS c
			INNER JOIN T_TEACHER t 
			ON t.ID = c.CLASS_TEACHER
			""", nativeQuery = true )
			List<ClassTeacherProjection> fetchAllClassTeacherRawQuery();
}