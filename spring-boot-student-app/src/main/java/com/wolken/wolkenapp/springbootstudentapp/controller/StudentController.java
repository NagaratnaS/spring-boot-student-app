package com.wolken.wolkenapp.springbootstudentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenapp.springbootstudentapp.entity.StudentEntity;
import com.wolken.wolkenapp.springbootstudentapp.service.StudentService;

@RestController
@RequestMapping("/")
public class StudentController {
	
	@Autowired
	StudentService service;

	@GetMapping("/index")
	public String index() {
		return "Hello world!";
	}
	
	@PostMapping("/save")
	public String save(@RequestBody StudentEntity entity) {
		return service.add(entity);
	}
	
	@GetMapping("/getall")
	public List<StudentEntity> getAll() {
		return service.getAll();
	}
	
	@PutMapping("/update")
	public String update(@RequestBody StudentEntity entity) {
		return service.updateByName(entity);
	}
	
	@DeleteMapping("/delete")
	public String delete(String studentName) {
		return service.deleteByName(studentName);
	}
}
