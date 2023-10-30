package SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import SpringJDBC.Dao.DaoImpl;
import SpringJDBC.Dao.StudentDao;
import SpringJDBC.Entity.Student;





public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("DB");
		ApplicationContext c1=new ClassPathXmlApplicationContext("SpringJDBC/dbconfig.xml");
		
		DaoImpl s=c1.getBean("impl",DaoImpl.class);
		
		Student st2=new Student();
		st2.setName("Pragati");
		st2.setCity("Varanasi");
		st2.setAge(23);
		
		int result=s.insert(st2);
//		System.out.println(result);
		
//		
//		Student st=new Student();
//		st.setID(14);
//		st.setName("Pragatii");
//		st.setCity("Banaras");
//		st.setAge(23);
//		
//		int result=s.update(st);
//		System.out.println(result);
		
//		Student st=new Student();
//		st.setID(12);
//		
//		int result=s.delete(st);
//		System.out.println(result);
		
//		Student st=s.getbyId(13);
//		System.out.println( st);
		
		List<Student> st=s.getall();
		for(Student s1:st) {
			System.out.println( s1);	
		}
		
		

	}

}
