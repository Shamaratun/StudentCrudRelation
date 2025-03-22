package org.isdb.StudentCrudRelation.model;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity(name= "T-Class")

    public class Class {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        @Column(nullable = false, length = 50)
        private String name;
        @OneToOne
        @JoinColumn(name = "class_Teacher"  , referencedColumnName = "id")
        private Teacher classTeacher;

       
        @Column(name="room_Number",nullable = false, unique = true, length = 50)
        private Integer roomNumber;
  

}
