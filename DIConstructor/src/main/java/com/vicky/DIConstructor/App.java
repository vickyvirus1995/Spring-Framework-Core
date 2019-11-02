package com.vicky.DIConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vicky.DIConstructor.POJO.Student;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext application = new ClassPathXmlApplicationContext("resources/ApplicationContext.xml");
       Student student1 = (Student)application.getBean("student1");
       
       System.out.println(student1);
       
       
       Student student2 = (Student)application.getBean("student2");
       System.out.println(student2);
    }
}
