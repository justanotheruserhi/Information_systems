package com.javapoint.habits.config;

import com.javapoint.habits.model.Client;

public interface PasswordEncoderHabits_int {
    Client registerNewUserAccount(Client clientDTO) throws EmailExistsException;
}
