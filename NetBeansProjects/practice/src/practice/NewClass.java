package practice;

import javax.swing.JLabel;
import java.awt.FlowLayout;

public final class NewClass extends javax.swing.JFrame {

    public NewClass() {
        setVisible(true);
        setSize(300, 400);
        setLocationRelativeTo(null);
        initComponents();
    }

    public void initComponents() {
        this.setLayout(new FlowLayout());
        JLabel jlabel = new JLabel("Njeri");
        add(jlabel);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String munufe[]) {
        NewClass newClass = new NewClass();
    }
}
