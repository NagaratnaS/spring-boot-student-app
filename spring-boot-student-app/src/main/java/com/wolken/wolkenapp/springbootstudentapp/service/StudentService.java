package com.wolken.wolkenapp.springbootstudentapp.service;

import java.util.List;

import com.wolken.wolkenapp.springbootstudentapp.entity.StudentEntity;


public interface StudentService {
	public String add(StudentEntity entity) ;
	public List<StudentEntity> getAll();
	public String updateByName(StudentEntity entity);
	public String deleteByName(String studentName);
}
