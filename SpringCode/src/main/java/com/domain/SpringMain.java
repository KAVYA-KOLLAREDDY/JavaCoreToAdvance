package com.domain;

import com.springcode.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.Services.Config;

public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Computer computer = context.getBean(Computer.class);
        computer.showData();
    }
}

