package com.javapoint.habits.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    static int i = 1;
    
    @Scheduled(cron = "*/5 * * * * ?")
    public void runFirst()throws InterruptedException{
        System.out.println("First start: " + ++i);
        Thread.sleep(5000);
        System.out.println("First finish: " + i);
    }
}
