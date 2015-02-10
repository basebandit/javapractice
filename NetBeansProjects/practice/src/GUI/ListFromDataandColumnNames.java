/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author mars
 */
public class ListFromDataandColumnNames {

    private java.util.Vector rowData;
    private java.util.Vector columnData;
    private String[] columnNames;
    private java.util.Vector ColumnNamesV;
    private javax.swing.JTable table;
    private javax.swing.JFrame f;

    public ListFromDataandColumnNames() {
        initComponents();
    }

    private void initComponents() {
        rowData = new java.util.Vector<>();
        columnData = new java.util.Vector(java.util.Arrays.asList("qq"));
        columnNames = new String[]{"a"};
        ColumnNamesV = new java.util.Vector<>(java.util.Arrays.asList(columnNames));
        table = new javax.swing.JTable(rowData, ColumnNamesV);
        f = new javax.swing.JFrame();
        f.setSize(300, 300);
        f.add(new javax.swing.JScrollPane(table));
        f.setVisible(true);
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ListFromDataandColumnNames();
    }
}
