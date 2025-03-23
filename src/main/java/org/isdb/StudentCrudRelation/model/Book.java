package org.isdb.StudentCrudRelation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "T-Book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false, length = 100)
	private String name;

	@Column(nullable = false, length = 100)
	private String author;
    @Column(nullable = false, length = 100)
    private String publisher;
   // OneToOne refers  One book can be connected with only one clazz.
    
    @OneToOne   
    @JoinColumn(name = "clazz",referencedColumnName = "id" ,nullable = false)
    private StudentClass clazz; 
//@Transient ---it would be present in model but wouldn't show up as Column.
 
//private Class clazz; //if  we use the commented one  it will show up only as a column .
   @ManyToOne
   @JoinColumn(name = "student", referencedColumnName = "id", nullable = false)
private Student student;

}
