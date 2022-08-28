package com.SpringAOP;

import com.SpringAOP.CustomAnnotation.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class SpringAOP {
    public static void main(String[] args) {
        SpringApplication.run(SpringAOP.class,args);

    }
}
