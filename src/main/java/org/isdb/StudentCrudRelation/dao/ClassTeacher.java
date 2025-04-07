package org.isdb.StudentCrudRelation.dao;

import lombok.Getter;

@Getter
public class ClassTeacher {
     String className;
     String classTeacherName;
 	private Integer roomNumber;
 	private String classTeacherEmail;
 	
	public ClassTeacher(String className, String classTeacherName, Integer roomNumber, String classTeacherEmail) {
		this.className = className;
		this.classTeacherName = classTeacherName;
		this.roomNumber = roomNumber;
		this.classTeacherEmail = classTeacherEmail;
	}
     
    }



