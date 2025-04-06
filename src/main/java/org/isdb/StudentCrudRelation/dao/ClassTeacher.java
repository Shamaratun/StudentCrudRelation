package org.isdb.StudentCrudRelation.dao;

import lombok.Getter;

@Getter
public class ClassTeacher {
     String className;
     String classTeacherName;

    public ClassTeacher(String className, String classTeacherName) {
        this.className = className;
        this.classTeacherName = classTeacherName;
    }


}
