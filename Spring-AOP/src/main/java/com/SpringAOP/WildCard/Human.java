package com.SpringAOP.WildCard;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class Human {
    @After("execution(public * study*())")
    //it means that any method in this application whose access modifier is public and  that caller function's return type is anything
//    and any method starts with study will be executed this wakeUp method
// if we wanted to invoke the aspect only when employee class in invoked we used
//    @After("execution(public * com.SpringAOP.WildCard.Employee.studySomething())")
    @Pointcut("execution(public * study*(..))")
    public  void myPointCut(){

    }
    @Before("myPointCut()")
    public  Object  wakeUp(JoinPoint joinPoint){

//        System.out.println("Good Morning!!"+" "+ Arrays.toString(joinPoint.getArgs()));
//        System.out.println(joinPoint.getSignature());
        Object[] objects=joinPoint.getArgs();
        System.out.println(objects[0]);
        System.out.println(objects[1]);
        System.out.println("Good morning!!");
        return  111;

    }

    @After("myPointCut()")
    public  void  sleep()
    {
        System.out.println("Good Night !!!!");
    }
}
