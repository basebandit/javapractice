/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;

/**
 *
 * @author mars
 */
public class ProgressBarDemo extends javax.swing.JPanel implements java.awt.event.ActionListener, java.beans.PropertyChangeListener {

    private final javax.swing.JProgressBar progressBar;
    private final javax.swing.JButton startButton;
    private final javax.swing.JTextArea taskOutput;
    private Task task;

    class Task extends javax.swing.SwingWorker<Void, Void> {
        /*
         * Main task. Executed in background thread.
         */

        @Override
        public Void doInBackground() {
            java.util.Random random = new java.util.Random();
            int progress = 0;
            //Initialize progress property
            setProgress(0);
            while (progress < 100) {
                //Sleep for up to one second(1 second = 1000 milliseconds)
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException ignore) {
                }
                //Make random progress
                progress += random.nextInt(10);
                setProgress(java.lang.Math.min(progress, 100));
            }
            return null;
        }
        /*
         * Executed in event dispatching thread
         */

        @Override
        public void done() {
            java.awt.Toolkit.getDefaultToolkit().beep();
            startButton.setEnabled(true);
            setCursor(null);//Turn off the wait cursor
            taskOutput.append("Done!\n");
        }
    }

    public ProgressBarDemo() {
        super(new java.awt.BorderLayout());

        //Create the demo's GUI
        startButton = new javax.swing.JButton("Start");
        startButton.setActionCommand("start");
        startButton.addActionListener(this);

        progressBar = new javax.swing.JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);

        taskOutput = new javax.swing.JTextArea(5, 20);
        taskOutput.setMargin(new java.awt.Insets(5, 5, 5, 5));
        taskOutput.setEditable(true);

        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.add(startButton);
        panel.add(progressBar);

        add(panel, java.awt.BorderLayout.PAGE_START);
        add(new javax.swing.JScrollPane(taskOutput), java.awt.BorderLayout.CENTER);
        setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    /**
     * Invoke when the user presses the start button
     *
     * @param evt
     */
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        startButton.setEnabled(false);
        setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
        //Instances of javax.swing.SwingWorker are not reusable,so
        //we create new instances as needed.
        task = new Task();
        task.addPropertyChangeListener(this);
        task.execute();
    }

    /**
     * Invoked when task's progres property changes
     *
     * @param evt
     */
    @Override
    public void propertyChange(java.beans.PropertyChangeEvent evt) {
        if ("progress".equals(evt.getPropertyName())) {
            int progress = (java.lang.Integer) evt.getNewValue();
            progressBar.setValue(progress);
            taskOutput.append(String.format("Completed %d%% of task.\n", task.getProgress()));
        }
    }

    public static void createAndShowGUI() {
        //Create and set up the window
        javax.swing.JFrame frame = new javax.swing.JFrame("ProgressBarDemo");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane
        javax.swing.JComponent newContentPane = new ProgressBarDemo();
        newContentPane.setOpaque(true);//content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window 
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
