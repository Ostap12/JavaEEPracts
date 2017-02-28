package com.voroniak;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
//        Performer performer = (Performer)context.getBean("audience");
//        performer.perform();
        Thinker volunteer = (Thinker)context.getBean("volunteer");
        Magician magician = (Magician)context.getBean("magician");
        volunteer.thinkOfSomething("I am THINKING ...");
        System.out.println(magician.getThoughts());

    }

}
