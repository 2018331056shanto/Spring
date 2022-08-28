package com.SpringAOP.CustomAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {
    @Autowired
    private Service service;
    @GetMapping("/")
    public  void springAop() throws InterruptedException {
        int xx=service.serve(12,12);
        System.out.println("controller "+xx);
    }
}
