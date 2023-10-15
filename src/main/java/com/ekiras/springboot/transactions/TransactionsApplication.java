package com.ekiras.springboot.transactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionsApplication {

    public static void main(String[] args) {
        System.out.println("STARTING APP");
        SpringApplication.run(TransactionsApplication.class, args);
        System.out.println("EXITING APP");
    }

}
