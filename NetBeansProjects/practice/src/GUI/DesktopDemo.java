/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.GroupLayout;

/**
 *
 * @author mars
 */
public class DesktopDemo extends javax.swing.JFrame {

    javax.swing.JButton btnLaunchApplication = new javax.swing.JButton("Launch Application");
    javax.swing.JButton btnLaunchBrowser = new javax.swing.JButton("Launch Browser");
    javax.swing.JButton btnLaunchEMail = new javax.swing.JButton();
    javax.swing.JRadioButton rbEdit = new javax.swing.JRadioButton("Edit");
    javax.swing.JRadioButton rbOpen = new javax.swing.JRadioButton("Open", true);
    javax.swing.JRadioButton rbPrint = new javax.swing.JRadioButton("Print");
    javax.swing.JTextField txtBrowserURI = new javax.swing.JTextField();
    javax.swing.JTextField txtMailTo = new javax.swing.JTextField();
    javax.swing.JTextField txtFile = new javax.swing.JTextField();
    javax.swing.ButtonGroup bgAppAction = new javax.swing.ButtonGroup();
    javax.swing.JLabel lblMailRecipient = new javax.swing.JLabel("E-mail:");
    javax.swing.JLabel lblBrowserUri = new javax.swing.JLabel("URI:");
    javax.swing.JLabel lblFile = new javax.swing.JLabel("File:");
    javax.swing.JButton btnFile = new javax.swing.JButton("...");
    javax.swing.JLabel emptyLabel = new javax.swing.JLabel(" ");
    javax.swing.JPanel conLeft = new javax.swing.JPanel();
    javax.swing.JPanel conRight = new javax.swing.JPanel();
    javax.swing.JPanel conCenter = new javax.swing.JPanel();
    javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
    java.io.File file;

    private java.awt.Desktop desktop;
    private java.awt.Desktop.Action action = java.awt.Desktop.Action.OPEN;

    /**
     * Creates new Form DesktopDemo
     */
    public DesktopDemo() {
        //init all components
        initComponents();
    }

    /**
     * Create and show Components
     */
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desktop Demo");
        txtBrowserURI.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                onLaunchBrowser(null);
            }
        });
        btnLaunchBrowser.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                onLaunchBrowser(ae);
            }
        });
        txtMailTo.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                onLaunchMail(null);
            }
        });
        btnLaunchEMail.setText("Launch Mail");
        btnLaunchEMail.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                onLaunchMail(ae);
            }
        });
        txtFile.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                onLaunchDefaultApplication(null);
            }
        });
        rbOpen.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                onOpenAction(ae);
            }
        });
        rbEdit.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                onEditAction(ae);
            }
        });
        rbPrint.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                onPrintAction(ae);
            }
        });
        btnLaunchApplication.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                onLaunchDefaultApplication(ae);
            }
        });
        btnFile.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                onChooseFile(ae);
            }
        });
        java.awt.Container conFrame = this.getContentPane();

        bgAppAction.add(rbOpen);
        bgAppAction.add(rbEdit);
        bgAppAction.add(rbPrint);

        //Components layouting
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(conFrame);
        conFrame.setLayout(layout);
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);

        javax.swing.GroupLayout.SequentialGroup majorHGroup = layout.createSequentialGroup();

        //Horizontal Group
        javax.swing.GroupLayout.ParallelGroup lblHGroup = layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
        lblHGroup.addComponent(lblBrowserUri, javax.swing.GroupLayout.Alignment.TRAILING);
        lblHGroup.addComponent(lblMailRecipient, javax.swing.GroupLayout.Alignment.TRAILING);
        lblHGroup.addComponent(lblFile, javax.swing.GroupLayout.Alignment.TRAILING);

        javax.swing.GroupLayout.ParallelGroup txtFieldsHGroup = layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
        txtFieldsHGroup.addComponent(txtMailTo);
        txtFieldsHGroup.addComponent(txtBrowserURI);

        javax.swing.GroupLayout.SequentialGroup rbHGroup = layout.createSequentialGroup();
        rbHGroup.addComponent(rbOpen);
        rbHGroup.addComponent(rbEdit);
        rbHGroup.addComponent(rbPrint);

        txtFieldsHGroup.addGroup(rbHGroup);

        javax.swing.GroupLayout.SequentialGroup fileHGroup = layout.createSequentialGroup();
        fileHGroup.addComponent(txtFile);
        fileHGroup.addComponent(btnFile);

        txtFieldsHGroup.addGroup(fileHGroup);

        javax.swing.GroupLayout.ParallelGroup btnHGroup = layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
        btnHGroup.addComponent(btnLaunchBrowser);
        btnHGroup.addComponent(btnLaunchEMail);
        btnHGroup.addComponent(btnLaunchApplication);

        majorHGroup.addGroup(lblHGroup);
        majorHGroup.addGroup(txtFieldsHGroup);
        majorHGroup.addGroup(btnHGroup);

        layout.setHorizontalGroup(majorHGroup);

        //Vertical Group
        javax.swing.GroupLayout.SequentialGroup majorVGroup = layout.createSequentialGroup();

        javax.swing.GroupLayout.ParallelGroup uriVGroup = layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE);
        uriVGroup.addComponent(lblBrowserUri);
        uriVGroup.addComponent(txtBrowserURI);
        uriVGroup.addComponent(btnLaunchBrowser);

        javax.swing.GroupLayout.ParallelGroup mailVGroup = layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE);
        mailVGroup.addComponent(lblMailRecipient);
        mailVGroup.addComponent(txtMailTo);
        mailVGroup.addComponent(btnLaunchEMail);

        javax.swing.GroupLayout.ParallelGroup rbVGroup = layout.createParallelGroup(GroupLayout.Alignment.BASELINE);
        rbVGroup.addComponent(rbOpen);
        rbVGroup.addComponent(rbEdit);
        rbVGroup.addComponent(rbPrint);

        javax.swing.GroupLayout.ParallelGroup fileVGroup = layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE);
        fileVGroup.addComponent(lblFile);
        fileVGroup.addComponent(btnLaunchApplication);
        fileVGroup.addComponent(txtFile);
        fileVGroup.addComponent(btnFile);

        majorVGroup.addGroup(uriVGroup);
        majorVGroup.addGroup(mailVGroup);
        majorVGroup.addGroup(rbVGroup);
        majorVGroup.addGroup(fileVGroup);

        layout.setVerticalGroup(majorVGroup);

        pack();
    }

    /**
     * Load the "desktop" icon into our frame window
     */
    private void loadFrameIcon() {
        java.net.URL imgUrl = null;
        javax.swing.ImageIcon imgIcon = null;

        imgUrl = DesktopDemo.class.getResource("/home/mars/NetBeansProjects/practice/images/desk32.gif");
        imgIcon = new javax.swing.ImageIcon(imgUrl);
        java.awt.Image img = imgIcon.getImage();
        this.setIconImage(img);
    }

    /**
     * Set the Desktop Action to PRINT before invoking the default application
     */
    private void onPrintAction(java.awt.event.ActionEvent evt) {
        action = java.awt.Desktop.Action.PRINT;
    }

    /**
     * Set the Desktop.Action to EDIT before invoking the default application.
     */
    private void onEditAction(java.awt.event.ActionEvent evt) {
        action = java.awt.Desktop.Action.EDIT;
    }

    /**
     * Set the Desktop.Action to OPEN before invoking the default application.
     */
    private void onOpenAction(java.awt.event.ActionEvent evt) {
        action = java.awt.Desktop.Action.OPEN;
    }

    /**
     * Launch the default application associated with a specific filename using
     * the preset Desktop.Action.
     *
     */
    private void onLaunchDefaultApplication(java.awt.event.ActionEvent evt) {
        String fileName = txtFile.getText();
        File file = new File(fileName);
        try {
            switch (action) {
                case OPEN:
                    desktop.open(file);
                    break;
                case EDIT:
                    desktop.edit(file);
                    break;
                case PRINT:
                    desktop.print(file);
                    break;
            }
        } catch (java.io.IOException ex) {
            System.out.println("Cannot perform the given operation to the " + file + " file");
        }
    }

    /**
     * Launch the default email client using the "mailto" protocol and the text
     * supplied by the user.
     *
     */
    private void onLaunchMail(java.awt.event.ActionEvent evt) {
        String mailTo = txtMailTo.getText();
        java.net.URI uriMailTo = null;
        try {
            if (mailTo.length() > 0) {
                uriMailTo = new java.net.URI("mailTo", mailTo, null);
                desktop.mail(uriMailTo);
            }
        } catch (java.io.IOException | java.net.URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Launch the default browser with the text provided by the user.
     *
     */
    private void onLaunchBrowser(java.awt.event.ActionEvent evt) {
        java.net.URI uri = null;
        try {
            uri = new java.net.URI(txtBrowserURI.getText());
            desktop.browse(uri);
        } catch (java.io.IOException ex) {
            System.out.println("The system cannot find the " + uri + "file specified");
        } catch (java.net.URISyntaxException ex) {
            System.out.println("Illegal character in path");
        }
    }

    private void onChooseFile(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == btnFile) {
            int returnVal = fc.showOpenDialog(DesktopDemo.this);
            if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
                txtFile.setText(file.getAbsolutePath());
            }
        }
    }

    /**
     * Enable actions that are supported on this host. The actions are: open
     * browser, open email client, and open, edit, and print files using their
     * associated application
     */
    private void enableSupportedActions() {
        if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
            txtBrowserURI.setEnabled(true);
            btnLaunchBrowser.setEnabled(true);
        }
        if (desktop.isSupported(java.awt.Desktop.Action.MAIL)) {
            txtMailTo.setEnabled(true);
            btnLaunchEMail.setEnabled(true);
        }
        if (desktop.isSupported(java.awt.Desktop.Action.OPEN)) {
            rbOpen.setEnabled(true);
        }
        if (desktop.isSupported(java.awt.Desktop.Action.EDIT)) {
            rbEdit.setEnabled(true);
        }
        if (desktop.isSupported(java.awt.Desktop.Action.PRINT)) {
            rbPrint.setEnabled(true);
        }
        if (rbEdit.isEnabled() || rbOpen.isEnabled() || rbPrint.isEnabled()) {
            txtFile.setEnabled(true);
            btnLaunchApplication.setEnabled(true);
            btnFile.setEnabled(true);
        }
    }

    /**
     * Disable all graphical components until we know whether their
     * functionality is supported.
     */
    private void disableActions() {
        txtBrowserURI.setEnabled(false);
        btnLaunchBrowser.setEnabled(false);

        txtMailTo.setEnabled(false);
        btnLaunchEMail.setEnabled(false);

        rbEdit.setEnabled(false);
        rbOpen.setEnabled(false);
        rbPrint.setEnabled(false);

        txtFile.setEnabled(false);
        btnLaunchApplication.setEnabled(false);
        btnFile.setEnabled(false);
    }

    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (java.lang.IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (java.lang.InstantiationException ex) {
            ex.printStackTrace();
        } catch (java.lang.ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        javax.swing.UIManager.put("swing.boldMetal", java.lang.Boolean.FALSE);
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {

            @Override
            public void run() {
                new DesktopDemo().setVisible(true);
            }
        });
    }
}
