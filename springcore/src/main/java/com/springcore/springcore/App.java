package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Collections.Emp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        
//        ApplicationContext c1=new ClassPathXmlApplicationContext("Collections/collectionconfig.xml");
//        Student s=(Student)c1.getBean("student2");
//        System.out.println(s);
        
        ApplicationContext c2=new ClassPathXmlApplicationContext("Collections/collectionconfig.xml");
        Emp e=(Emp)c2.getBean("emp1");
        System.out.println(e);
    }
}