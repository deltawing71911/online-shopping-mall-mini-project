package com.mycompany.ordersystem;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService customerService =
            context.getBean("customerService", CustomerService.class);
        List<Customer> customers = customerService.getCustomers();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

}
