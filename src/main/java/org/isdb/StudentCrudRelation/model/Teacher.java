package org.isdb.StudentCrudRelation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import org.isdb.StudentCrudRelation.config.InstantDeserializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "T-Teacher")
public class Teacher implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false, length = 50)
	private String name;
	@Column(unique = true, nullable = false, length = 50)
	private String email;
	@Column(nullable = false, length = 10)
	private String gender;
	@Column(nullable = false, length = 30)
	private String address;
	@Column(nullable = false, length = 15)
	private String phone;

	@JsonDeserialize(using = InstantDeserializer.class)
	@Column(name = "joining_Date", nullable = false, updatable = false)
	private Instant joiningDate;
	@Column(nullable = false)
	private BigDecimal salary;
	@Column(name = "maritalStatus")
	private Boolean isMarried;

}