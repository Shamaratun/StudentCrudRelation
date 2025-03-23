package org.isdb.StudentCrudRelation.model;

<<<<<<< HEAD


=======
>>>>>>> 18077df612c977c954877a58b39e002ddcc0e9f3
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
<<<<<<< HEAD
import jakarta.persistence.OneToOne;
=======
>>>>>>> 18077df612c977c954877a58b39e002ddcc0e9f3
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

<<<<<<< HEAD
@Column(nullable = false, length = 100)
    private String publisher;
@OneToOne    // OneToOne refers  One book can be connected with only one clazz.
@JoinColumn(name = "clazz",referencedColumnName = "id" ,nullable = false)
//@Transient ---it would be present in model but wouldn't show up as Column.
   private Class clazz; 
//private Class clazz; //if  we use the commented one  it will show up only as a column .
@ManyToOne
@JoinColumn(name = "student", referencedColumnName = "id", nullable = false)
private Student student;
=======
	@Column(nullable = false, length = 100)
	private String publisher;
>>>>>>> 18077df612c977c954877a58b39e002ddcc0e9f3

	@ManyToOne
	@JoinColumn(name = "student", referencedColumnName = "id", nullable = false)
	private Student student;
}
