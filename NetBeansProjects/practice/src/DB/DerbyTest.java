/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.*;

/**
 *
 * @author mars
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DerbyTest {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;

	public void openConnection() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			conn = DriverManager
					.getConnection("jdbc:derby://localhost:1527/Student,mwas,MWAS");
			System.out.println("Connection Success");
		} catch (Exception e) {
			System.out.println();
		}
	}

	public void closeConnection() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				rs.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void createTable() {
		try {
			String createString = "CREATE TABLE FRIENDS(ID INT PRIMARY KEY, NAME VARCHAR(25))";
			stmt = conn.createStatement();
			stmt.executeUpdate(createString);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void insert() {
		try {
			PreparedStatement psInsert = conn
					.prepareStatement("INSERT INTO FRIENDS(ID, NAME) VALUES(1, 'Jane')");
			psInsert.executeUpdate();
			PreparedStatement psInsert1 = conn
					.prepareStatement("INSERT INTO FRIENDS(ID, NAME) VALUES(2, 'Thomas')");
			psInsert1.executeUpdate();
			PreparedStatement psInsert2 = conn
					.prepareStatement("INSERT INTO FRIENDS(ID, NAME) VALUES(3, 'Beky')");
			psInsert2.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void select() {
		try {
			Statement stmt2 = conn.createStatement();
			ResultSet rs = stmt2.executeQuery("select * from FRIENDS");
			System.out.println("FRIENDS\n\n");
			int num = 0;

			while (rs.next()) {
				System.out.println(++num + ": ID: " + rs.getInt(1) + ": Name: "
						+ rs.getString(2));
			}
			rs.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void delete() {
		// CODE TO DELETE RECORDS
	}

	public static void main(String[] args) {
		DerbyTest dt = new DerbyTest();
		dt.openConnection();
		dt.createTable();
		dt.insert();
		//dt.select();
		dt.closeConnection();
	}
}
