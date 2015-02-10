/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author mars
 */
public class Select {

    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/cookbook";
        Connection conn = null;

        try {
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.out.println("Failed To load mysql driver");
            return;
        }
        try {
            conn = DriverManager.getConnection(url, "root", "new_password");
            Statement select = conn.createStatement();
            ResultSet result = select.executeQuery("select * from limbs");
            
            //System.out.println(DriverManager.getDrivers());
            System.out.println("Got Results:");
            while (result.next()) {
                int key;
                String val;
                key = result.getInt(3);
                if (result.wasNull()) {
                    key = -3;
                }
                val = result.getString(1);
                if (result.wasNull()) {
                    val = null;
                }
                System.out.println("key = " + key);
                System.out.println("val = " + val);
            }
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
