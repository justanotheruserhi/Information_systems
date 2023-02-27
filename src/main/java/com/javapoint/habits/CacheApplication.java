package com.javapoint.habits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CacheApplication {
	//где ошибка-то, intellij???
	public static void main(String[] args) {
		SpringApplication.run(CacheApplication.class, args);
	}

}
