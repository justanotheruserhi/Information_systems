package com.javapoint.habits.model;
import java.sql.*;
public class DBConnection {

    private final String url = "jdbc:postgresql://localhost:5432/habits_project";
    private final String username = "habits_project";
    private final String password= "password";

    private Connection connection;

    public DBConnection() {
        try{
            connection = DriverManager.getConnection(url,username,password);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public Connection getConnection() {return connection; }

}
