package com.kodilla.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseApplication.class, args);

        String name = "Waldek";

        System.out.println("Helloł World tu " + name);
        System.out.println("Będzie");
        System.out.println("Nie będzie");
    }

}
