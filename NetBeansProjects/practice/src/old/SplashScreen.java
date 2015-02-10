/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package old;

/**
 *
 * @author mars
 */
public class SplashScreen extends javax.swing.JWindow implements java.beans.PropertyChangeListener, java.awt.event.MouseListener {

    private final javax.swing.ImageIcon imgIcon = new javax.swing.ImageIcon("/home/mars/NetBeansProjects/HPMIS/src/images/ribbon.png");
    private final String OS = System.getProperty("os.name").toLowerCase();
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel progressLabel;
    private Task task;

    class Task extends javax.swing.SwingWorker<Void, Void> {
        /*
         * Main task. Executed in background thread.
         */

        private old.Login loginForm;

        @Override
        public Void doInBackground() {
            java.util.Random random = new java.util.Random();
            int progress = 0;
            //Initialize progress property 
            setProgress(0);
            while (progress < 100) {
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                //Make random progress
                progress += random.nextInt(10);
                setProgress(progress);
            }
            return null;
        }
        /*
         * Executed in event dispatching thread
         */

        @Override
        public void done() {
            java.awt.Toolkit.getDefaultToolkit().beep();
            //Turn off the wait cursor
            setCursor(null);
            new SplashScreen().dispose();
            loginForm = new old.Login();
        }
    }

    public SplashScreen() {
        super();
        initComponents();
    }

    private void initComponents() {
        progressBar = new javax.swing.JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        progressBar.setForeground(new java.awt.Color(255, 0, 0, 245));

        progressLabel = new javax.swing.JLabel();

        javax.swing.JPanel progressPanel = new javax.swing.JPanel(new java.awt.BorderLayout(2, 2));
        progressPanel.setBackground(java.awt.Color.WHITE);
        progressPanel.add(progressBar, java.awt.BorderLayout.PAGE_START);
        progressPanel.add(progressLabel, java.awt.BorderLayout.PAGE_END);

        javax.swing.JLabel splashLabel = new javax.swing.JLabel(imgIcon);
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        getContentPane().add(splashLabel, java.awt.BorderLayout.CENTER);
        getContentPane().add(progressPanel, java.awt.BorderLayout.PAGE_END);
        getContentPane().addMouseListener(this);
        getContentPane().setBackground(java.awt.Color.WHITE);
        setSize(500, 400);
        //setLocation(((SplashScreen.WIDTH - 490) / 2), ((SplashScreen.HEIGHT - 330) / 2));
        setLocationRelativeTo(null);
        task = new Task();
        task.addPropertyChangeListener(this);
        task.execute();
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        new SplashScreen().dispose();
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent me) {
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent me) {
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent me) {
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent me) {
    }

    @Override
    public void propertyChange(java.beans.PropertyChangeEvent evt) {
        if ("progress".equals(evt.getPropertyName())) {
            int progress = (Integer) evt.getNewValue();
            progressBar.setValue(progress);
            new Runnable() {
                public void run() {
                    int i = 0;
                    progressLabel.setVisible(true);
                    //progressLabel.setOpaque(true);

                    while (i <= 200) {    // Runs for 100 milliseconds
                        progressLabel.setText("");
                        getProgressInfo(i);
                        setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
                        i++;
                        try {
                            Thread.sleep(60);//sleeps for 60 milliseconds
                        } catch (InterruptedException ex) {
                            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                        }
                        validateOS();
                    }
                }

                private void validateOS() {
                    if (isWindows()) {
                        getOS("Windows Operating System Detected");
                    } else if (isMac()) {
                        getOS("Mac Operating System Detected");
                    } else if (isUnix()) {
                        getOS("Unix Operating System Detected");
                    } else if (isSolaris()) {
                        getOS("Solaris Operating System Detected");
                    }
                }

                private String getOS(String os) {
                    return os;
                }
            };

        }
    }

    private void getProgressInfo(int n) {
        String nameOS = "os.name";
        String versionOS = "os.version";
        String architectureOS = "os.arch";
        int i = 0;
        if (i > 0 && i <= 50) {
            progressLabel.setText("\nName of the OS: "
                    + System.getProperty(nameOS));
        } else if (i > 50 && i <= 100) {
            progressLabel.setText("Version of the OS: "
                    + System.getProperty(versionOS));
        } else if (i > 100 && i <= 150) {
            progressLabel.setText("Architecture of The OS: "
                    + System.getProperty(architectureOS));

        } else if (i > 150 && i <= 200) {

            progressLabel.setText("Almost Finished ...");

        }
    }

    private boolean isMac() {
        return (OS.contains("mac"));
    }

    private boolean isWindows() {
        return (OS.contains("win"));
    }

    private boolean isUnix() {
        return (OS.contains("nix") || OS.contains("nux") || OS.contains("aix"));
    }

    private boolean isSolaris() {
        return (OS.contains("sunos"));
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                SplashScreen splash = new SplashScreen();
                splash.setVisible(true);
            }
        });
    }

}
