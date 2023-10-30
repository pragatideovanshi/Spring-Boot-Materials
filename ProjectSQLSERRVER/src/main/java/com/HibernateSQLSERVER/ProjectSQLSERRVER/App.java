package com.HibernateSQLSERVER.ProjectSQLSERRVER;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Project Started!" );
        //Session Factory is interface , This is a type of Connection
        //where we can find Session there should be one session factory in the project
        Configuration cfg=new Configuration();
        cfg.configure();
        //cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Order order=new Order();
        order.setID(9);
        order.setName("Tab");
        order.setDescription("IPAD");
        order.setOrderby("Priyotosh");
        order.setPrice(50000);
        System.out.println(order);
        
        // Creating Object of Address
        Address address=new Address();
        address.setStreet("Street");
        address.setCity("Delhi");
        address.setOpen(true);
        address.setAdddate(new Date());
        address.setX(123.4321);
        
        
//        Session session=factory.getCurrentSession();
        Session session=factory.openSession();
        Transaction tx= session.beginTransaction();
        
        session.save(order);
        session.save(address);
        tx.commit();
        session.close();
        
        
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
    }
}
