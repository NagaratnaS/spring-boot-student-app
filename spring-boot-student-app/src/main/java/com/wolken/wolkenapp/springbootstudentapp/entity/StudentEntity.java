package com.wolken.wolkenapp.springbootstudentapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name="student_spring_table")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	@Column(name="studentName")
	private String studentName;
	@Column(name="studentAddress")
	private String studentAddress;
	@Column(name="studentSemester")
	private int studentSemester;
}

