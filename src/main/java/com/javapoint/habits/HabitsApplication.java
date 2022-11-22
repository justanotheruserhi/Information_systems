package com.javapoint.habits;

import com.javapoint.habits.controller.ConnectPostgresql;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HabitsApplication {
    public static void main(String[] args) {
        ConnectPostgresql connectPSQL = new ConnectPostgresql();
        connectPSQL.connect();
        SpringApplication.run(HabitsApplication.class, args);
    }

}
