package com.SpringAOP.CustomAnnotation;

@org.springframework.stereotype.Service
public class Service {

    @LogExecutionTime(value="hello how are you")
    public  int  serve(int x,int y) throws  InterruptedException{
        System.out.println(x*y);

        System.out.println("i am from service");
//        Thread.sleep(2000);
        return  x*y;
    }
}
