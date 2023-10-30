package com.MicrosoftSQLJPA.Dao;

import org.springframework.data.repository.CrudRepository;

import com.MicrosoftSQLJPA.Entity.Employee;


public interface EmpRepo extends CrudRepository<Employee, Integer>{

}
