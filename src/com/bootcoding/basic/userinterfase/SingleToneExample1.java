package com.bootcoding.basic.userinterfase;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class SingleToneExample1 {


    private SingleToneExample1(){

    }

   public static Connection GetConnection() {
       Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakshit","roor","root");

        } catch (Exception e) {
            e.printStackTrace();
        }
               return connection;

    }
}
