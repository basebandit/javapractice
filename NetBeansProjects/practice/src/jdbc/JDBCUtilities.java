package jdbc;

import java.sql.DatabaseMetaData;
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mars
 */
public class JDBCUtilities {

    private Connection conn;
    private Statement st;
    private ResultSet rs;
    private ResultSetMetaData metadata;
    private DatabaseMetaData databaseMetadata;
    private Context ctx;

    public MysqlConnectionPoolDataSource createPooledDataSource(String dbName) {
        com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource ds = null;
        try {
            registerDataSource(ds, dbName);
            ds = new MysqlConnectionPoolDataSource();

        } catch (Exception e) {
            e.getMessage();
        }
        return ds;
    }

    public Connection getConnection(String serverName, int portNumber, String databaseName, String username, String password) {
        com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource ds = createPooledDataSource(databaseName);
        try {
            ds.setServerName(serverName);
            ds.setPortNumber(portNumber);
            ds.setDatabaseName(databaseName);
            ds.setUser(username);
            ds.setPassword(password);
            conn = ds.getConnection(username, password);
        } catch (SQLException e) {
            e.getMessage();
        }
        return conn;
    }

    public Connection getConnection(String serverName, int portNumber, String databaseName, String username, String password, String description) {
        com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource ds = createPooledDataSource(databaseName);
        try {
            ds.setServerName(serverName);
            ds.setPortNumber(portNumber);
            ds.setDatabaseName(databaseName);
            ds.setUser(username);
            ds.setPassword(password);
            conn = ds.getConnection();
        } catch (SQLException e) {
            e.getMessage();
        }
        return conn;
    }

    public DatabaseMetaData getDatabaseMetaData(Connection conn) {
        try {

            databaseMetadata = conn.getMetaData();
        } catch (SQLException e) {
            e.getMessage();
        }
        return databaseMetadata;
    }

    public void registerDataSource(MysqlConnectionPoolDataSource datasource, String dbName) {
        try {
            ctx = new InitialContext();
            ctx.bind("jdbc/" + dbName, datasource);
            datasource.setDatabaseName("jdbc/" + dbName);
        } catch (NamingException e) {
            e.getMessage();
        }
    }

    public void getServerDetails(Connection conn) {
        DatabaseMetaData dbMetadata = getDatabaseMetaData(conn);
        try {
            System.out.println(dbMetadata.getDatabaseProductName());
            System.out.println(dbMetadata.getDatabaseProductVersion());
        } catch (SQLException e) {
            e.getMessage();
        }

    }

    public ResultSet getResultSet(Statement stmnt, Connection conn, String query) {
        try {
            stmnt = conn.createStatement();
            rs = stmnt.executeQuery(query);
        } catch (SQLException e) {
            e.getMessage();
        }

        return rs;
    }
}
