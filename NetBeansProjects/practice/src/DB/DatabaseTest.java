/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mars
 */
public class DatabaseTest extends JFrame {

    JTextField hostField;
    JTextField queryField;
    QueryTableModel qtm;

    public DatabaseTest() {
        super("Database Test Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 200);

        qtm = new QueryTableModel();
        JTable table = new JTable(qtm);

    }

    class QueryTableModel extends AbstractTableModel {

        Vector cache;//willhold string[] objects...
        int colCount;
        String[] headers;
        Connection db;
        Statement statement;

        @Override
        public int getRowCount() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getColumnCount() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object getValueAt(int i, int i1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
