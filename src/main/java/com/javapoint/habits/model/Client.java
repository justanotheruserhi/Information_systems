package com.javapoint.habits.model;

import jakarta.persistence.*;
@Entity
@Table(schema = "public", name = "user_data") //у вас свои схемы поэтому название схемы надо изменить, больше я ничего не меняла
public class Client {
    @Id
    @Column(name = "user_id", nullable = false, unique=true)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer user_id;

    @Column(name = "username")
    private String name;
    @Column(name = "password")
    private String password;

    @Column(name = "birthday")
    private String birthday;

    public Integer getId() {
        return user_id;
    }

    public void setId(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {return birthday;}
    public void setBirthday(String birthday) { this.birthday = birthday;}

}
