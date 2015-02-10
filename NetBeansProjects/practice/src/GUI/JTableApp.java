/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.text.MessageFormat;
import java.util.logging.Level;

/**
 *
 * @author mars
 */
public class JTableApp extends javax.swing.JFrame {

    private String SERVER = "127.0.0.1";
    private String DATABASE = "employee";
    private int PORT = 3306;
    private String USER = "root";
    private String PASSWORD = "new_password";
    private javax.swing.JFrame f1;
    private javax.swing.JLabel l1, l2, l3;
    private javax.swing.JComboBox jc1;
    private javax.swing.JButton btn1;
    private java.sql.Connection conn;
    private java.sql.ResultSet rs1, rs2;
    private java.sql.Statement stmt1, stmt2;
    private java.sql.PreparedStatement pst;
    private String ids, from, sql, psql;
    private String[] columnNames;
    private java.util.Vector v;
    private javax.swing.table.DefaultTableModel model;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane scroll;
    private String uid, uname, email, pass, country;

    public JTableApp() {
        super("Fetching Student Info From Databse");
        initComponents();
    }

    private void initComponents() {
        uname = "";
        email = "";
        pass = "";
        country = "";

        columnNames = new String[]{"User id", "User Name", "Email", "Country"};

        f1 = new javax.swing.JFrame("Database Search Result");
        f1.setLayout(new java.awt.BorderLayout());
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);

        model = new javax.swing.table.DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        table = new javax.swing.JTable();
        table.setModel(model);
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);

        scroll = new javax.swing.JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        l1 = new javax.swing.JLabel("Search Employee");
        l1.setForeground(java.awt.Color.red);
        l1.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 20));

        l2 = new javax.swing.JLabel("Select Name");
        l2.setBounds(100, 50, 350, 40);

        btn1 = new javax.swing.JButton("search");
        add(btn1);
        btn1.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (e.getSource() == btn1)//To change body of generated methods, choose Tools | Templates.
                {
                    showTableData();
                }
            }
        });

        f1.add(scroll);
        f1.setVisible(true);
        f1.setSize(400, 300);
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(l1);
        add(l2);
        conn = connectDB(SERVER, PORT, DATABASE, USER, PASSWORD);
        addUserToVector();
        add(jc1);
        setLayout(null);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void showTableData() {
        int i = 0;
        from = (String) jc1.getSelectedItem();
        psql = "Select * from employee where uname = '" + from + "'";
        try {
            pst = conn.prepareStatement(psql);
            rs2 = pst.executeQuery();
            if (rs2.next()) {
                uid = rs2.getString("uid");
                uname = rs2.getString("uname");
                email = rs2.getString("email");
                pass = rs2.getString("pass");
                country = rs2.getString("country");
                model.addRow(new Object[]{uid, uname, email, pass, country});
                i++;
            }
            if (i < 1) {
                javax.swing.JOptionPane.showMessageDialog(null, "No Record Found", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else if (i == 1) {
                System.out.println(String.format("%sRecord Found", i));
            } else {
                System.out.println(MessageFormat.format("{0}Records Found", i));
            }
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private java.sql.Connection connectDB(String server, int Port, String Database, String User, String Password) {
        this.SERVER = server;
        this.PORT = Port;
        this.DATABASE = Database;
        this.USER = User;
        this.PASSWORD = Password;
        //conn2 = null;

        try {

            //Setting up the datasource object
            com.mysql.jdbc.jdbc2.optional.MysqlDataSource ds = new com.mysql.jdbc.jdbc2.optional.MysqlDataSource();
            ds.setServerName(server);
            ds.setPortNumber(Port);
            ds.setDatabaseName(Database);
            ds.setUser(User);
            ds.setPassword(Password);

            //Getting a connection object
            conn = ds.getConnection();

            //Getiing database info
            java.sql.DatabaseMetaData meta = conn.getMetaData();

        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    private void addUserToVector() {
        try {
            sql = "select uname from employee";
            stmt1 = conn.createStatement();
            rs1 = stmt1.executeQuery(sql);
            v = new java.util.Vector<>();
            while (rs1.next()) {
                ids = rs1.getString(1);
                v.add(ids);
            }
            jc1 = new javax.swing.JComboBox<>(v);
            jc1.setBounds(150, 110, 150, 30);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt1.close();
                rs1.close();
            } catch (java.sql.SQLException e) {
                java.util.logging.Logger.getLogger(JTableApp.class.getName()).log(Level.SEVERE, null, e);

            }
        }
    }

    public static void main(String[] args) {
        new JTableApp();
    }
}
