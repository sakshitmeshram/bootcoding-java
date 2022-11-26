package com.bootcoding.basic.userinterfase;

import java.sql.Connection;
import java.sql.SQLException;

public class testjdbc {

    public static void main(String[] args) throws SQLException {

        Connection st = SingleToneExample1.GetConnection();
    }
}
