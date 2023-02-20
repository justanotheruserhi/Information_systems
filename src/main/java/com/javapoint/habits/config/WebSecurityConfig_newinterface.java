package com.javapoint.habits.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

public interface WebSecurityConfig_newinterface {
    void configure(AuthenticationManagerBuilder auth) throws Exception;
}
