package com.StudentManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.StudentManagement.Entity.StudentMangement;
import com.StudentManagement.StudentRepo.StudentRepository;

@Component
public class StudentService {
	
	@Autowired
	StudentRepository sr;
	
	public StudentMangement registerstudent(StudentMangement s) {
		StudentMangement sm= sr.save(s);
		return sm;
		
	}

}
