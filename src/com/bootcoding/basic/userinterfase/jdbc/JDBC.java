package com.bootcoding.basic.userinterfase.jdbc;

import com.bootcoding.basic.userinterfase.jdbc.dao.DatabaseConn;

import java.net.ConnectException;
import java.sql.*;
import java.util.Scanner;

public class JDBC {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email here");
        String getEmails = sc.nextLine();

       Connection connection = DatabaseConn.conector();

        Statement stm = connection.createStatement();
        String sql="select email from student where email='"+getEmails+"' ";
        ResultSet result = stm.executeQuery(sql);
        int count =0;
        while (result.next()){
            if(result.getString("email").equals(getEmails)){
                    count++;
            }
        }

        if(count>0){
            System.out.println("email Present");
        }
        else {
            System.out.println("Not Present");
        }


        connection.close();

    }
}
