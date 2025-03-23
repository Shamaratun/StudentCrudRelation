package org.isdb.StudentCrudRelation.repository;


import org.isdb.StudentCrudRelation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student,Integer>{

}
