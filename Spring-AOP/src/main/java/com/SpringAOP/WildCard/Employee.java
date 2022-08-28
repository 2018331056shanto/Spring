package com.SpringAOP.WildCard;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    public  void studySomething(int x,int y){
        System.out.println(x*y);
        System.out.println("You need to go to work");
    }
}
