package com.Services;

import com.springcode.AsusHardDisk;
import com.springcode.Computer;
import com.springcode.HardDisk;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.javainuse")
public class Config {
    @Bean
    public HardDisk asusHardDisk() {
        return new AsusHardDisk();
    }

    @Bean
    public Computer computer() {
        return new Computer(asusHardDisk()); // Constructor Injection
        // Computer computer = new Computer();
        // computer.setHardDisk(asusHardDisk()); // Setter Injection
        // return computer;
    }
}
