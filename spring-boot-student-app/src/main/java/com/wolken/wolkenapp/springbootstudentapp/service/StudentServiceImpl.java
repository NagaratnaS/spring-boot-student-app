package com.wolken.wolkenapp.springbootstudentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wolken.wolkenapp.springbootstudentapp.entity.StudentEntity;
import com.wolken.wolkenapp.springbootstudentapp.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository repository;
	
	
	@Override
	public String add(StudentEntity entity) {
		// TODO Auto-generated method stub
		if (entity!=null) {
			if (!entity.getStudentName().equals(null) && !entity.getStudentAddress().equals(null) && entity.getStudentSemester() > 0) {
				repository.save(entity);
				return "Data added successfulluy!!";
			}
		}
		return "Some error occurred!!";	
	}
	@Override
	public List<StudentEntity> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	
	@Override
	public String updateByName(StudentEntity entity) {
		// TODO Auto-generated method stub
		
		if (entity!=null) {
			if (!entity.getStudentName().equals(null) && !entity.getStudentAddress().equals(null) && entity.getStudentSemester() > 0) {
				StudentEntity updatingEntity = repository.findByStudentName(entity.getStudentName());
				updatingEntity.setStudentAddress(entity.getStudentAddress());
				updatingEntity.setStudentSemester(entity.getStudentSemester());
				repository.save(updatingEntity);
				return "Data updated successfulluy!!";
			}
		}
		return "Some error occurred!!";	
		
	}
	@Override
	public String deleteByName(String studentName) {
		// TODO Auto-generated method stub
		
		if (!studentName.equals(null)) {
			repository.deleteByStudentName(studentName);
			return "Deleted successfully!";
		}
		return "Some error occurred!!";
	}
	
	

}
