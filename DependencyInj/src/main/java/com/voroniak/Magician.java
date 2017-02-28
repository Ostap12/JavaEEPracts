package com.voroniak;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Magician implements MindReader{
    private String thoughts;

    @Pointcut("execution(* com.voroniak.Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts){}

    @Before("thinking(thoughts)")
    public void interceptThoughts(String thoughts){
        System.out.println("Intercepting volunteers's thoughts");
        this.thoughts = thoughts;
    }

    public String getThoughts(){
        return thoughts;
    }

}
