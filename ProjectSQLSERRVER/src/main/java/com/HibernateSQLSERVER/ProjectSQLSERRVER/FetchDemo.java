package com.HibernateSQLSERVER.ProjectSQLSERRVER;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
        //cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session=factory.openSession();
        
        Address o=(Address)session.get(Address.class,1);
        Address o1=(Address)session.load(Address.class,1);
        System.out.println(o);
        System.out.println(o1.getCity());
        session.close();
        factory.close();

	}

}
