/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;

public class DbAdapter {

    public static Connection ConnectDb() throws java.sql.SQLException {
        Connection conn = null;
        try {
            //Setting up the Datasource object
            com.mysql.jdbc.jdbc2.optional.MysqlDataSource ds = new com.mysql.jdbc.jdbc2.optional.MysqlDataSource();
            ds.setServerName("127.0.0.1");
            ds.setPortNumber(3306);
            ds.setDatabaseName("HPMIS");
            ds.setUser("root");
            ds.setPassword("");

            //Getting a conection object
            conn = ds.getConnection();

            //getting database info
            DatabaseMetaData meta = conn.getMetaData();
            System.out.println("ServerName: " + meta.getDatabaseProductName());
            System.out.println("Server version: " + meta.getDatabaseProductVersion());

        } catch (SQLException e) {
            System.err.println(MessageFormat.format("Exception: {0}", e.getMessage()));
        }
        return conn;

    }

//    public static void main(String... args) throws SQLException {
//        ConnectDb();
//    }
}
