package com.SpringAOP.WildCard;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public  void  studyAnything(int p,int q){
        System.out.println(p+ " "+q);
        System.out.println("you need to go to school");

    }
}
