/*
Представьте, что здесь ничего нет. Оно всё равно не работает.
package com.javapoint.habits.config;

import com.javapoint.habits.repository.RepoClient;
import jakarta.persistence.EntityNotFoundException;
import org.apache.catalina.User;
import org.springframework.cache.annotation.Cacheable;

@Cacheable("user_data") //табличка с юзерами
public class GetUser {
    public User get(Long id) {
        log.info("getting user by id: {}", id); //log кто таков
        return RepoClient.findById(id) //это можно создать в репозитории
                .orElseThrow(() -> new EntityNotFoundException("User not found by id " + id));
    }
}*/
