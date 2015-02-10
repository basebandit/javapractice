                                                                                           /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author mars
 */
public class Grades {

    private static JTable table;

    public static void adjustColumnPreferredWidths(JTable table) {
        // strategy - get max width for cells in column and
        // make that the preferred width
        TableColumnModel columnModel = table.getColumnModel();
        for (int col = 0; col < table.getColumnCount(); col++) {

            int maxwidth = 0;
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer rend
                        = table.getCellRenderer(row, col);
                Object value = table.getValueAt(row, col);
                Component comp
                        = rend.getTableCellRendererComponent(table, value, false, false, row, col);
                maxwidth = Math.max(comp.getPreferredSize().width, maxwidth);
            } // for row
            TableColumn column = columnModel.getColumn(col);
            TableCellRenderer headerRenderer = column.getHeaderRenderer();
            if (headerRenderer == null) {
                headerRenderer = table.getTableHeader().getDefaultRenderer();
            }
            Object headerValue = column.getHeaderValue();
            Component headerComp
                    = headerRenderer.getTableCellRendererComponent(table,
                            headerValue,
                            false,
                            false,
                            0,
                            col);
            maxwidth = Math.max(maxwidth,
                    headerComp.getPreferredSize().width);
            column.setPreferredWidth(maxwidth);

        } // for col 
    }

    public static class TestColumnResizer {

        final static Object[][] TABLE_DATA = new Object[20][5];
//            {new Integer(1), " ", " ", " "},
//            {new Integer(2), " ", " ", " "},
//            {new Integer(3), " ", " ", " "},
//            {new Integer(4), " ", " ", " "}

        final static String[] COLUMN_NAMES = {
            "Name", "Subject", "TotalMarks", "Grade",};

    }

    public void getGrade() {
        int rowindex = table.getSelectedRow();
        int k = 0;
        int j = 0;
        for (int i = 0; i <= 5; i++) {
            int totalMarks = 0;
            if (table.getSelectedColumn() == 5) {
                k = table.getSelectedRow();
                j = table.getSelectedColumn();
                totalMarks = (int) table.getValueAt(k, j);
            }
            if ((totalMarks >= 69) && (totalMarks <= 100)) {
                table.setValueAt("A", k, j);
            } else if ((totalMarks >= 60) && (totalMarks < 69)) {
                table.setValueAt("B", k, j);
            } else if ((totalMarks >= 50) && (totalMarks < 60)) {
                table.setValueAt("C", k, j);
            } else if ((totalMarks >= 40) && (totalMarks < 50)) {
                table.setValueAt("D", k, j);
            } else if (totalMarks < 40) {
                table.setValueAt("E", k, j);
            }

        }
    }

    public static void main(String[] args) {
        // 142 mac l&f has a header bug - force metal for today
        try {

            UIManager.setLookAndFeel(
                    UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("UIManager Not found");
        }
        DefaultTableModel mod
                = new DefaultTableModel(TestColumnResizer.TABLE_DATA, TestColumnResizer.COLUMN_NAMES);
        table = new JTable(mod);
        JScrollPane pane
                = new JScrollPane(table,
                        ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                        ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        JFrame frame = new JFrame("JTable Column Widths");
        frame.getContentPane().add(pane);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // now get smart about col widths
        final JTable fTable = table;
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Grades.adjustColumnPreferredWidths(fTable);
                fTable.revalidate();
            }
        });
    }
}
// public void valueChanged(ListSelectionEvent event) {
//            if (event.getValueIsAdjusting()) {
//                rowIndex = table.getSelectedRow();
//                if (data[rowIndex][0] == null || data[rowIndex][0] == "") {
//                    btnEdit.setEnabled(false);
//                    btnDelete.setEnabled(false);
//                } else {
//                    btnEdit.setEnabled(true);
//                    btnDelete.setEnabled(true);
//                }
//            }
