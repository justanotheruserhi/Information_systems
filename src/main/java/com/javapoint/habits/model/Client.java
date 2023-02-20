package com.javapoint.habits.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
@Table(schema = "public", name = "user_data") //у вас свои схемы поэтому название схемы надо изменить, больше я ничего не меняла
public class Client {


    @Id
    @Column(name = "user_id", nullable = false, unique=true)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer user_id;

    @Column(name = "username")
    @NotBlank(message = "Specify your username")
    @Size(min = 5, max = 20)
    private String username;
    @Column(name = "password")
    @NotBlank(message = "You must have a password")
    @Size(min = 8, max = 20)
    private String password;

    @Column(name = "email")
    @NotBlank(message = "Enter your email")
    private String email;

    //private boolean active;

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    public void setRole(Set<Role> roles) {
        this.roles = roles;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    /*public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }*/



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {return email;}
    public void setEmail(String email) { this.email = email;}

}
