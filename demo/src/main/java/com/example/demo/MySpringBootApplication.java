package com.example.demo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }

   @Override
    public void run(String... args) throws Exception {
        // Accessing the passed arguments
        System.out.println("Application started with arguments: ");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
