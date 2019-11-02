package com.vicky.DependencyInjectionProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vicky.DependencyInjectionProperty.POJO.Registration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext application = new ClassPathXmlApplicationContext("resources/spring.xml");
        Registration reg = (Registration)application.getBean("reg");
        System.out.println(reg);
        
        
    }
}
