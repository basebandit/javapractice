/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author mars
 */
public class SimpleConnection {

    public static void main(String[] args) {
        Connection conn = null;
        Statement select;
        ResultSet result;

        //Process the command line
        if (args.length != 4) {
            System.out.println("Syntax: Java SimpleConnection " + "DRIVER URL UID PASSWORD");
            return;
        }
        try {//load the driver
            Class.forName(args[0]).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println("Problem Loading Driver,Class does not exist");
            return;
        }
        try {
            conn = DriverManager.getConnection(args[1], args[2], args[3]);
            System.out.println("Connection Successful!");
            select = conn.createStatement();
            result = select.executeQuery("Select * from limbs");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
