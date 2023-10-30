package RemoveXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Autowiring.Emp1;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c2=new AnnotationConfigApplicationContext(JavaConfig.class);
        Student1 e=(Student1)c2.getBean("first");
        e.display(); 
	}

}