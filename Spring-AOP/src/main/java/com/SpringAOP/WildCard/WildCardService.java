package com.SpringAOP.WildCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WildCardService {
@Autowired
private Employee employee;
@Autowired
private  Student student;
    public void  wildCard(){
//        joinPoints
//        Before
        employee.studySomething(4,3);
//        After

//        joinPoints
//        Before
        student.studyAnything(44,33);
//        After
    }
}
