package com.bootcoding.basic.userinterfase.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConn {

    public static Connection conn = null;

    private DatabaseConn(){

    }

    public static Connection conector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //Load and register the driver
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakshit","root","root"); // establish the connection

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return conn;
    }

    public static void closeConnection(){

        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
