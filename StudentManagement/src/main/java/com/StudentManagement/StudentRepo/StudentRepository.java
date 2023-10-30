package com.StudentManagement.StudentRepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.StudentManagement.Entity.StudentMangement;

public interface StudentRepository extends CrudRepository<StudentMangement, Integer>{

}
