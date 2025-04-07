package org.isdb.StudentCrudRelation.dao;

import lombok.Getter;

@Getter
public class ClassTeacherDTO {
	private String className;
	private String classTeacherName;
	private Integer roomNumber;
	private String classTeacherEmail;
	
	public ClassTeacherDTO(String className, String classTeacherName, Integer roomNumber, String classTeacherEmail) {
		this.className = className;
		this.classTeacherName = classTeacherName;
		this.roomNumber = roomNumber;
		this.classTeacherEmail = classTeacherEmail;
	}

}
