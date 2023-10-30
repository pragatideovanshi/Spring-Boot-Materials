package com.StudentManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentManagement.Entity.StudentMangement;
import com.StudentManagement.Service.StudentService;

@RestController
@Component
public class StudentController {
	
	@Autowired
	private StudentService studentservice;

	@PostMapping("/register")
	public StudentMangement Register(@RequestBody StudentMangement student) {
		return studentservice.registerstudent(student);
	}
}
