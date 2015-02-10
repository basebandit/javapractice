/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinghacks;

import java.awt.Color;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableCellRenderer;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.table.TableColumn;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mars
 */
public class Grades {

    private static TableColumnModel columnModel;
    private static TableCellRenderer rend;
    private static TableCellRenderer headerRenderer;
    private static Component comp;
    private static Component headerComp;
    private static TableColumn column;
    private static int row, col, rowIndex, colIndex;
    private static Object value;
    private static Object headerValue;
    private static Object cellContent;
    private static DefaultTableModel mod;
    private static Object[][] TABLE_DATA;
    private static String[] COLUMN_NAMES;
    private static JTable table;
    private static JTable ftable;
    private static JScrollPane pane;
    private static JFrame frame;

    public Grades() {
        TABLE_DATA = new Object[20][5];
        COLUMN_NAMES = new String[]{"Name", "Subject", "Total Marks", "Average", "Grades"};
        mod = new DefaultTableModel(TABLE_DATA, COLUMN_NAMES);
        table = new JTable(mod);
        pane = new JScrollPane(table, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ftable = table;
        frame = new JFrame("Grading App");
        getMouseListener();
        frame.getContentPane().add(pane);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Adjusting column sizes to suit their contents.The method goes through all
     * the rows and renders each cell. It keeps a running tally of the widest
     * component in the column, and after considering all the rows, it sends
     * this maximum width to setPreferredWidth().
     *
     * @param table
     */
    public static void adjustColumnPreferredWidths(JTable table) {
        /**
         * strategy - get max width for cells in column and make that the
         * preferred width For each column in the table,
         */
        columnModel = table.getColumnModel();
        for (col = 0; col < table.getColumnCount(); col++) {
            int maxWidth = 0;
            for (row = 0; row < table.getRowCount(); row++) {
                rend = table.getCellRenderer(row, col);
                value = table.getValueAt(row, col);
                comp = rend.getTableCellRendererComponent(table, value, false, false, row, col);
                maxWidth = Math.max(comp.getPreferredSize().width, maxWidth);
            }//for row
//            column = columnModel.getColumn(col);
//            column.setPreferredWidth(maxWidth);
            System.out.println();
            column = columnModel.getColumn(col);
            headerRenderer = column.getHeaderRenderer();
            table.getTableHeader().setBackground(Color.ORANGE);
            if (headerRenderer == null) {
                headerRenderer = table.getTableHeader().getDefaultRenderer();
                headerValue = column.getHeaderValue();
                headerComp = headerRenderer.getTableCellRendererComponent(table, headerValue, false, false, 0, col);
                maxWidth = Math.max(maxWidth, headerComp.getPreferredSize().width);
                column.setPreferredWidth(maxWidth);
            }

        }//for col
    }

    public void getGrade() {
//        int rowindex = table.getSelectedRow();

//        int j = 3;
//        int totalMarks = 0;
        int j;
//        for (col = 0; col < table.getColumnCount(); col++) {

//            for (row = 0; row < table.getRowCount(); row++) {
        if (table.getSelectedColumn() == 3) {
            colIndex = 2;
            j = table.getSelectedRow();
            j = j-1;
            int totalMarks = (int) table.getValueAt(j, colIndex);

            if (table.getSelectedColumn() == 4) {
                rowIndex = table.getSelectedRow();
                table.setCellSelectionEnabled(false);

                colIndex = 4;
//                    for (rowIndex = 0; rowIndex < table.getRowCount(); rowIndex++) {

                if ((totalMarks >= 69) && (totalMarks <= 100)) {
                    table.setValueAt("A", rowIndex, colIndex);
                } else if ((totalMarks >= 60) && (totalMarks < 69)) {
                    table.setValueAt("B", rowIndex, colIndex);
                } else if ((totalMarks >= 50) && (totalMarks < 60)) {
                    table.setValueAt("C", rowIndex, colIndex);
                } else if ((totalMarks >= 40) && (totalMarks < 50)) {
                    table.setValueAt("D", rowIndex, colIndex);
                } else if (totalMarks < 40) {
                    table.setValueAt("E", rowIndex, colIndex);
                }
            }
        }
    }
        //        }
    //    }
    public final void getMouseListener() {
        table.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                getGrade();
                // System.out.println("memmmmmmmmmmmmm"); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

//        table.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                
//            }
//        });
    public Object GetData(JTable table, int row_index, int col_index) {
        return table.getModel().getValueAt(row_index, col_index);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //ujanja ya column widths kwa table
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Grades grades = new Grades();
                Grades.adjustColumnPreferredWidths(ftable);
                ftable.revalidate();
                grades.getGrade();
            }
        });
    }
}
