package com.javapoint.habits.repository;

import com.javapoint.habits.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepoClient extends JpaRepository<Client, Integer> {
    /*
    метод не отлажен, поэтому комментирую, чтобы не ломать им ничего остальным
    static Optional<Object> findById(Long user_id) { //тут должно быть что-то другое, TODO
        return RepoClient.findById(user_id);
    }*/
}
