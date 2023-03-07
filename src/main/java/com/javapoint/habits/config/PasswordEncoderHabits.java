package com.javapoint.habits.config;

import com.javapoint.habits.model.Client;
import com.javapoint.habits.model.Role;
import com.javapoint.habits.repository.RepoClient;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collections;

public class PasswordEncoderHabits implements PasswordEncoderHabits_int {

    private final PasswordEncoder passwordEncoder;
    private RepoClient repository;

    public PasswordEncoderHabits (PasswordEncoder passwordEncoder){
       this.passwordEncoder = passwordEncoder;
   }

    @Override
    @Cacheable(value = "user_data", key = "#UserName") //имя таблицы, поле с именем
    public Client registerNewUserAccount(Client clientDTO) throws EmailExistsException {
        if (clientDTO.getEmail()==null) {
            throw new EmailExistsException(
                    "There is an account with that email address:" + clientDTO.getEmail());
        }
        Client client = new Client();
        client.setUsername(clientDTO.getUsername());

        client.setPassword(passwordEncoder.encode(clientDTO.getPassword()));

        client.setEmail(clientDTO.getEmail());
        Role role = Role.USER;
        client.setRole(Collections.singleton(role));
        return repository.save(client);
    }
    /*new Role(String.valueOf(USER))*/
}
