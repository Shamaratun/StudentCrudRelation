package org.isdb.StudentCrudRelation.model;

import java.time.Instant;
import java.util.List;
import org.springframework.data.annotation.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor  
@Entity(name = "T_Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, length = 100)
    private String name;
    
    @Column(nullable = false, length = 100)
    private String email;

    @OneToOne
    @JoinColumn(name = "clazz",referencedColumnName = "id" ,nullable = false)
    private Class clazz;

    @Column(nullable = false, length = 30, unique = true)
    private Integer roll;

    @OneToMany(mappedBy = "student")
    private List<Book> book;

    @Column(nullable = false, length = 100)
    private String phone; 

     @Column(length = 100)
    private String address;

    @Column(nullable = false, length = 100)
    private String gender;

    @Column(nullable = false, length = 100)
    private Instant dob;


}
