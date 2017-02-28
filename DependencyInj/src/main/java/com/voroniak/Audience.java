package com.voroniak;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
    public void takeSeats() { // Перед виступом
        System.out.println("The audience is taking their seats.");
    }
    public void turnOffCellPhones() { // Перед виступом
        System.out.println("The audience is turning off their cellphones");
    }
    public void applaud() { // Після виступу
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }
    public void demandRefund() { // Після невдалого виступу
        System.out.println("Boo! We want our money back!");
    }
    public void watchPerformance(ProceedingJoinPoint joinpoint){
        try{
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis();

            joinpoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP CLAP CLAP");
            System.out.println("The performance took "+ (end-start) +" milliseconds.");
        }catch(Throwable t){
            System.out.println("Boo! We want our money back!");
        }
    }

}
