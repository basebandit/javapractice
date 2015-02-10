/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import java.awt.event.MouseAdapter;
import javax.swing.JFrame;

/**
 *
 * @author mars
 */
public class SimpleTableDemo extends javax.swing.JPanel {

    private boolean DEBUG = false;
    private static javax.swing.JTable table;

    public SimpleTableDemo() {
        super(new java.awt.GridLayout(1, 10));

        String[] columnNames = {"First Name", "Last Name", "Sport", "# of Years", "Vegeterian"};
        Object[][] data = {{"Kathy", "Smith", "Snowboarding", 3, false},
        {"John", "Doe", "Rowing", 3, true}, {"Sue", "Black", "Knitting", 2, false}, {"Jane", "White", "Speed reading", 20, true}, {"Joe", "Brown", "Pool", 10, false}
        };
        table = new javax.swing.JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new java.awt.Dimension(500, 70));
        table.setFillsViewportHeight(true);

        if (DEBUG) {
            table.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    DEBUG = true;
                    printDebugData(table);
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    DEBUG = false;
                }
            });
            //Create the scrollpane and add the table to it
            javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(table);

            //add the scrollpane to this panel
            add(scrollPane);
        }
    }

    public void printDebugData(javax.swing.JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();

        System.out.println("Value of data: ");
        for (int i = 0; i < numRows; i++) {
            System.out.print("  row" + i + ":");
            for (int j = 0; j < numCols; j++) {
                System.out.println(" " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("----------------------------------");
    }

    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //create and setup the window.
        javax.swing.JFrame frame = new javax.swing.JFrame("SimpleTableDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create and setup the content pane
        SimpleTableDemo newContentPane = new SimpleTableDemo();
        newContentPane.setOpaque(true);//content panes must be opaque
        frame.setContentPane(newContentPane);
        frame.add(table);
        //Display the window
        frame.pack();
        frame.setSize(700, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String... args) {
        //Schedule a job for the event-dispatching thread:
        //Create and showing this application's GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
