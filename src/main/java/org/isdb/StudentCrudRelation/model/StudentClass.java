package org.isdb.StudentCrudRelation.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name= "T-Class")

    public class StudentClass {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        @Column(nullable = false, length = 50,unique = true)
        private String name;
        
        @OneToOne
        @JoinColumn(name = "class_Teacher"  , referencedColumnName = "id")
        private Teacher classTeacher;

       
        @Column(name="room_Number",nullable = false, unique = true, length = 50)
        private Integer roomNumber;
  

}
