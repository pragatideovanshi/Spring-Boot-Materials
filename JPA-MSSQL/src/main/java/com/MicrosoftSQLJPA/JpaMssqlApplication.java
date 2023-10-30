package com.MicrosoftSQLJPA;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.MicrosoftSQLJPA.Dao.EmpRepo;
import com.MicrosoftSQLJPA.Entity.Employee;


@SpringBootApplication
public class JpaMssqlApplication {

	public static void main(String[] args) {
		ApplicationContext c1=SpringApplication.run(JpaMssqlApplication.class, args);
		 EmpRepo r= c1.getBean(EmpRepo.class);
		 
//		 Employee u1=new Employee();
//		 u1.setName("Pragati");
//		 u1.setCity("Banarass");
//		 
//		 Employee u2=new Employee();
//		 u2.setName("Pragati");
//		 u2.setCity("Banarass");
//		 
//		 Employee u3=new Employee();
//		 u3.setName("Pragati");
//		 u3.setCity("Banarasi");
//		 
//		 List<Employee> u=List.of(u1,u2,u3);
//		 Iterable<Employee> ir=r.saveAll(u);
//		 ir.forEach(user->{
//			 System.out.println(user);
//		 });
//		 System.out.println(u1);
		 
		 //Update
		 
		Optional<Employee>o= r.findById(5);
		
		Employee e1=o.get();
		e1.setName("Akshay");
		Employee e2=r.save(e1);
		System.out.println(e2);

	}
}
