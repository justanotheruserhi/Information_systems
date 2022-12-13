package com.javapoint.habits.model;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

    @Entity
    @Table(schema = "public", name = "user_check_in")
    public class User_check_in {
        @Id
        @Column(name = "user_id", nullable = false, unique=true)
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Integer user_id;

        @Id
        @Column(name = "habit_id", nullable = false, unique=true)
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Integer habit_id;

        @Column(name = "check_date")
        @Timestamp("dd/mm/yyyy HH/mm/ss")
        //private Timestamp check_date;


        public Integer getIdUs() {
            return user_id;
        }

        public void setIdUs(Integer user_id) {
            this.user_id = user_id;
        }

        public Integer getIdHab() {
            return habit_id;
        }

        public void setIdHab(Integer habit_id) {
            this.habit_id = habit_id;
        }


       // public Timestamp getCheck_date() {return check_date;}
       // public void setCheck_date(Timestamp check_date) { this.check_date = check_date;}

    }
