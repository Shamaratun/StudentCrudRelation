package org.isdb.StudentCrudRelation.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "T_Student")
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(nullable = false, length = 30)
	private String name;

	@Column(nullable = false, length = 50)
	private String email;

	@ManyToOne
	@JoinColumn(name = "class_id", nullable = false)
	private StudentClass clazz;

	@Column(nullable = false, length = 30, unique = true)
	private Integer roll;

	@ManyToMany
	@JoinTable(name = "MAP_STUDENT_BOOK", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
	private Set<Book> books = new HashSet<>();

	@Column(nullable = false, length = 17)
	private String phone;

	@Column(length = 100)
	private String address;

	@Column(nullable = false, length = 10)
	private String gender;

	@Column(nullable = false, length = 30)
	private Instant dob;

}