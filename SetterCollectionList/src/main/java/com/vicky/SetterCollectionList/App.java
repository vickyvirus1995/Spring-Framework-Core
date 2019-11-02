package com.vicky.SetterCollectionList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vicky.SetterCollectionList.POJO.SJT;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext application = new ClassPathXmlApplicationContext("resources/ApplicationContext.xml");
        SJT sjt = (SJT)application.getBean("sjtobj");
        
        System.out.println(sjt);
    }
}
