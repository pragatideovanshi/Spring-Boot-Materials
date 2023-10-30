package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Collections.Emp;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext c2=new ClassPathXmlApplicationContext("Autowiring/autoconfig.xml");
        Emp1 e=(Emp1)c2.getBean("emp1");
        System.out.println(e.getAd().getCity());
	}

}