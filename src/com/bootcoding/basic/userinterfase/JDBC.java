package com.bootcoding.basic.userinterfase;

import java.net.ConnectException;
import java.sql.*;
import java.util.Scanner;

public class JDBC {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter id");
        int id = sc.nextInt();

        System.out.println("enter name");
        String name = sc.next();

        Class.forName("com.mysql.cj.jdbc.Driver");  //Load and register the driver


        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakshit","root","root"); // establish the connection

        PreparedStatement stmt =  con.prepareStatement("insert into student values( ?, ?)");  // makes a statements

        stmt.setInt(1,id);
        stmt.setString(2,name);

        stmt.execute();





    }
}
