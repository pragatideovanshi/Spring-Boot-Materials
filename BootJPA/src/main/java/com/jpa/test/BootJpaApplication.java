package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.Dao.UserRepo;
import com.jpa.test.entity.User;

@SpringBootApplication
public class BootJpaApplication {

	public static void main(String[] args) {
	 ApplicationContext c1=SpringApplication.run(BootJpaApplication.class, args);
	 UserRepo r= c1.getBean(UserRepo.class);
	 
	 User u=new User();
	 u.setName("Pragati");
	 u.setCity("Banarsi");
	 
	 User u1=r.save(u);
	 System.out.println(u1);
	}

}
