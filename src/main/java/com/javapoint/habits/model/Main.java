package com.javapoint.habits.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args){
        DBConnection conec = new DBConnection();

        String count = "select * from statistics";

        try {
            Statement statement = conec.getConnection().createStatement();
            ResultSet resultset = statement.executeQuery(count);

            while(resultset.next()) {
                int cnt = resultset.getInt(1);
                System.out.println(cnt);
            }
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }

    }
}
