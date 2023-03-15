package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(IoCConfig.class);


        try {
            ICustomerService service = context.getBean("service",ICustomerService.class);
            service.add();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }




    }
}