package com.Tut.ProjectwithMaven;

import org.hibernate.SessionFactory;
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
        System.out.println(factory);
        
    }
}
