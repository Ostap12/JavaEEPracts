package com.voroniak;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        Performer performer = (Performer)context.getBean("kenny");
        performer.perform();
    }

}
