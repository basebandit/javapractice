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
public class MyJtableComponent {

    private Object[][] cellData;
    private String[] columnNames;

    private javax.swing.JTable table;
    private javax.swing.JFrame f;

    public MyJtableComponent() {
        initComponents();
    }

    private void initComponents() {
        cellData = new Object[][]{{"1-1", "1-2"}, {"2-1", "2-2"}};
        columnNames = new String[]{"col1", "col2"};
        table = new javax.swing.JTable(cellData, columnNames);
        f = new javax.swing.JFrame();
        f.setSize(300, 300);
        f.add(new javax.swing.JScrollPane(table));
        f.setVisible(true);
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyJtableComponent();
    }
}
