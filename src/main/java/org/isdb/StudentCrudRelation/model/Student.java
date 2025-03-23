package org.isdb.StudentCrudRelation.model;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

<<<<<<< HEAD




=======
>>>>>>> 18077df612c977c954877a58b39e002ddcc0e9f3
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

<<<<<<< HEAD
    @OneToMany(mappedBy = "student")
    private List<Book> books;
=======
	@OneToOne
	@JoinColumn(name = "student_class", referencedColumnName = "id", nullable = false)
	private Class studentClass;
>>>>>>> 18077df612c977c954877a58b39e002ddcc0e9f3

	@Column(nullable = false, unique = true)
	private int roll;

	@OneToMany(mappedBy = "student")
	private List<Book> books; // Renamed to plural for clarity

	@Column(nullable = false, length = 100)
	private String phone;

<<<<<<< HEAD
    @Column(nullable = false, length = 100)
    private Instant dob;
    

=======
	@Column(length = 100)
	private String address;
>>>>>>> 18077df612c977c954877a58b39e002ddcc0e9f3

	@Column(nullable = false, length = 100)
	private String gender;

	@Column(nullable = false)
	private Instant dob;
}
