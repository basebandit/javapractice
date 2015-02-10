/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;


import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 *
 * @author mars
 */
public class patientsDB {

    private Statement stmnt;
    private static Connection conn = null;
    private ResultSet rs = null;
    private MysqlConnectionPoolDataSource ds;
    private final String SERVER_NAME = "127.0.0.1";
    private final int PORT_NUMBER = 3306;
    private final String DATABASE_NAME = "patients";
    private final String USER = "root";
    private final String PASSWORD = "";
    private final String QUERY = "select * from " + DATABASE_NAME;

    public patientsDB() {
        initComponents();
    }

    private void initComponents() {
        try {
            String[] Fields = new String[]{"pid", "first_name", "othername", "gender", "age"};
            conn = new JDBCUtilities().getConnection(SERVER_NAME, PORT_NUMBER, DATABASE_NAME, USER, PASSWORD);
            rs = new JDBCUtilities().getResultSet(stmnt, conn, QUERY);
            System.out.println(Arrays.toString(Fields));
            while (rs.next()) {

//                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
//                    System.out.print(rs.getMetaData().getColumnName(i));
//                }
                for (int i = 0; i < Fields.length; i++) {

                    System.out.print(rs.getString(Fields[i]) + "\t");
                }
                System.out.println();
            }

        } catch (SQLException e) {
            e.getMessage();
        } finally {
            try {
                if ((conn != null) && (stmnt != null)) {
                    conn.close();
                    stmnt.close();
                }
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }

    public static void main(String[] args) {
        new patientsDB();

    }

}
