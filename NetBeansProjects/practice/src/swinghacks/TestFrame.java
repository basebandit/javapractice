/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinghacks;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.ImageIcon;

/**
 *
 * @author mars
 */
public class TestFrame extends JFrame {

    public TestFrame() {
        super("Graphics Demo");
        getContentPane().add(new JCanvas());
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class JCanvas extends JComponent {

        private final Color m_tRed = new Color(255, 0, 0, 150);
        private final Color m_tGreen = new Color(0, 255, 0, 150);
        private final Color m_tBlue = new Color(0, 0, 255, 150);

        private final Font m_biFont = new Font("Monospaced", Font.BOLD | Font.ITALIC, 36);
        private final Font m_pFont = new Font("SansSerif", Font.PLAIN, 12);
        private final Font m_bFont = new Font("Serif", Font.BOLD, 24);

        private final ImageIcon m_flight = new ImageIcon("/home/mars/NetBeansProjects/practice/src/GUI/images/middle.gif");

        public JCanvas() {
            setDoubleBuffered(true);
            setOpaque(true);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponents(g);
            //Fill the entire component with white
            g.setColor(Color.white);
            g.fillRect(0, 0, getWidth(), getHeight());

            //Filled Yellow circle
            g.setColor(Color.yellow);
            g.fillOval(0, 0, 240, 240);

            //Filled magenta circle
            g.setColor(Color.magenta);
            g.fillOval(160, 160, 240, 240);

            //get the width and height of the icon
            int w = m_flight.getIconWidth();
            int h = m_flight.getIconHeight();

            //Paint the icon below the blue square
            m_flight.paintIcon(this, g, 280 - (w / 2), 120 - (h / 2));

            //Paint the icon below the red square
            m_flight.paintIcon(this, g, 120 - (w / 2), 280 - (h / 2));

            //Filled transparent red square
            g.setColor(m_tRed);
            g.fillRect(60, 220, 120, 120);

            //Filled transparent green circle
            g.setColor(m_tGreen);
            g.fillOval(140, 140, 120, 120);

            //Fillled transparent blues square
            g.setColor(m_tBlue);
            g.fillRect(220, 60, 120, 120);

            g.setColor(Color.BLACK);

            //Bold Italic,36-point "swing"
            g.setFont(m_biFont);
            FontMetrics fm = g.getFontMetrics();
            w = fm.stringWidth("swing");
            h = fm.getAscent();
            g.drawString("Swing", 120 - (w / 2), 120 + (h / 4));
            // Plain, 12-point "is"
            g.setFont(m_pFont);
            fm = g.getFontMetrics();
            w = fm.stringWidth("is");
            h = fm.getAscent();
            g.drawString("is", 200 - (w / 2), 200 + (h / 4));
            // Bold, 24-point "powerful!!"
            g.setFont(m_bFont);
            fm = g.getFontMetrics();
            w = fm.stringWidth("powerful!!");
            h = fm.getAscent();
            g.drawString("powerful!!", 280 - (w / 2), 280 + (h / 4));
        }
        // Most layout managers need this information

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(400, 400);
        }

        @Override
        public Dimension getMinimumSize() {
            return getPreferredSize();
        }

        @Override
        public Dimension getMaximumSize() {
            return getPreferredSize();
        }

    }

    public static void main(String[] args) {
        TestFrame mainFrame = new TestFrame();
    }

}
