package com.javapoint.habits.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Statistics {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer user_id;
    private Integer  cnt_habits;

    public Integer getCnt_habits() {
        return  cnt_habits;
    }

    public void setCnt_habits(Integer cnt_habits) {
        this.cnt_habits = cnt_habits;
    }

    public Integer getId() {
        return user_id;
    }

    public void setId(Integer user_id) {
        this.user_id = user_id;
    }
}