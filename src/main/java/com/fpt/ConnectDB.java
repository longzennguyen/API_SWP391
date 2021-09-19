/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  com.hdsoft.ConnectDB
 */
package com.fpt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static ConnectDB conInstance = null;

    public static ConnectDB getInstance() {
        if (conInstance == null) {
            return new ConnectDB();
        }
        return conInstance;
    }

    public static Connection conHD() throws SQLException {
        String url = "jdbc:postgresql://127.0.0.1:5432/postgresql";
        String user = "adempiere";
        String pass = "123123";
        Connection con = DriverManager.getConnection(url, user, pass);
        return con;
    }
}

