package com.SpringAOP.CustomAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
    @Around("@annotation(com.SpringAOP.CustomAnnotation. LogExecutionTime)")
//    Next, our @Around annotation has a point cut argument. Our pointcut just says,
//   - ‘Apply this advice any method which is annotated with @LogExecutionTime.'
//    There are lots of other types of pointcuts, but they will again be left out if scoped.
//@Around(value="execution(* com.SpringAOP.CustomAnnotation.*.serve(..))")
    @Cacheable(value="object",key = "object-value")
    public  Object logExecutionTime(ProceedingJoinPoint joinPoint) throws  Throwable{
        final long start= System.currentTimeMillis();
//        System.out.println(Arrays.toString(joinPoint.getArgs()));
        Object [] objectsArg=joinPoint.getArgs();
        System.out.println(objectsArg[0]+ " "+objectsArg[1]);
        objectsArg[0]=Integer.parseInt(objectsArg[0]+"")-2;
        objectsArg[1]=Integer.parseInt(objectsArg[1]+"")-2;

          Object proceed=joinPoint.proceed(objectsArg);
//          jointPoint.proceed()  method pass the control over the caller function otherwise it do not give the control over caller function
        MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();
        Method method=methodSignature.getMethod();

        LogExecutionTime logExecutionTime=method.getAnnotation(LogExecutionTime.class);
        System.out.println(logExecutionTime.value());
        final  long executionTime=System.currentTimeMillis()-start;

        System.out.println(joinPoint.getSignature()+ " executed in  "+executionTime+"ms");
//        System.out.println(proceed);
//        anything we change in the passed argument from caller function will be available to those caller functions' argument
        return proceed;
    }
}
