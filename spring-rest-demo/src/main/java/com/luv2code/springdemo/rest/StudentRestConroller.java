package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@RequestMapping("/api")
public class StudentRestConroller {
	private List<Student> theStudent;

	@PostConstruct
	public void laodStudent() {
		theStudent = new ArrayList<Student>();
		theStudent.add(new Student("kiran", "Bhatt"));
		theStudent.add(new Student("mahesh", "Bhatt"));
		theStudent.add(new Student("aaliya", "Bhatt"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudentList() {
		return theStudent;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudentList(@PathVariable int studentId) {
		
		// check the student id with the list
		
		if(studentId >= theStudent.size() || studentId < 0) {
			throw new StudentNotFoundException("Student is not found "+studentId);
		}
		return theStudent.get(studentId);
	}
	


}
