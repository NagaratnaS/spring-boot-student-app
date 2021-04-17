package com.wolken.wolkenapp.springbootstudentapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wolken.wolkenapp.springbootstudentapp.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

	public void deleteByStudentName(String studentName);
	public StudentEntity findByStudentName(String studentName);
}
