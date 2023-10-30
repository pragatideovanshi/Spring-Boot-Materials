package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration cfg=new Configuration();
	        cfg.configure();
	        //cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        question q=new question();
	        q.setQuestion("What is Java1");
	        Answer a= new Answer();
	        a.setAnswer_Id(1199);
	        a.setAnswer("Java17 is programming Language");
	        q.setAnswer(a);
	        
	        question q1=new question();
	        q1.setQuestion("What is API15");
	        Answer a1= new Answer();
	        a1.setAnswer_Id(1167);
	        a1.setAnswer("Application1 Program Interface6");
	        q1.setAnswer(a1);
	        
	        Session session=factory.openSession();
	        Transaction tx= session.beginTransaction();
	        
	        session.save(q);
	        session.save(a);
	        session.save(q1);
	        session.save(a1);
	        tx.commit();
	        question q2=(question)session.get(question.class,1);
	        System.out.println(q2.getQuestion());
	        System.out.println(q2.getAnswer().getAnswer());
	        session.close();
	        
	        
	        factory.close();

	}

}
