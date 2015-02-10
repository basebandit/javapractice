/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinghacks;

import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.RenderingHints;
import javax.swing.SwingUtilities;

/**
 * RichJLabel extends the standard javax.swing.JLabel and adds a tracking
 * argument to the constructor. Next, it adds two methods for the right and left
 * shadow. These are called shadows because they will be drawn below the main
 * text, but whether they actually look like shadows depends on the color, as
 * well as the x- and y-offsets passed into each method.
 *
 * @author mars
 */
public class RichJLabel extends JLabel {

    private final int tracking;
    private static JFrame frame;

    public RichJLabel(String text, int tracking) {
        super(text);
        this.tracking = tracking;
    }
    private int left_x, left_y, right_x, right_y;
    private Color left_color, right_color;

    public void setLeftShadow(int x, int y, Color color) {
        left_x = x;
        left_y = y;
        left_color = color;
    }

    public void setRightShadow(int x, int y, Color color) {
        right_x = x;
        right_y = y;
        right_color = color;
    }

    /**
     * This implementation of getPreferredSize() calculates the size based on
     * the font metrics of the currently set text. The FontMetrics object
     * contains methods to get the width and height of the font for the current
     * text. Because the tracking variable adds to the existing tracking of the
     * font, you can expand the width by adding a tracking width between each
     * letter,one per letter, except the last letter. The line w +=
     * (text.length( )-1)*tracking does just that. The shadows will be drawn the
     * same size as the base text, but they will be offset by the left_x and
     * right_x values, so you need to add those in as well. Tracking only
     * affects the horizontal space between letters, so height can be calculated
     * normally via the fontmetrics.getHeight() method. Every Swing component
     * returns its desired size using the getPreferredSize() method. By
     * adjusting the returned size to be a bit bigger, layout controls using
     * this component will give the label the extra room it needs:
     *
     * @return
     */
    @Override
    public Dimension getPreferredSize() {
        String text = getText();
        FontMetrics fm = this.getFontMetrics(getFont());

        int w = fm.stringWidth(text);
        w += (text.length() - 1) * tracking;
        w += left_x + right_x;
        int h = fm.getHeight();
        h += left_y + right_y;
        return new Dimension(w, h);
    }

    @Override
    public void paintComponent(Graphics g) {
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        char[] chars = getText().toCharArray();

        FontMetrics fm = this.getFontMetrics(getFont());

        int h = fm.getAscent();
        int x = 0;
        /**
         * This is a simple loop that calculates the width of each character,
         * plus the tracking, then draws it three times: first with the left
         * offsets, next with the right offsets, and finally in the normal
         * position. At the end of the loop, you just increase x to move on to
         * the next letter. The rendering hint line at the bottom returns the
         * graphics object to its original anti-aliasing state.
         */

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int w = fm.charWidth(ch) + tracking;

            g.setColor(left_color);
            g.drawString("" + chars[i], x - left_x, h - left_y);

            g.setColor(right_color);
            g.drawString("" + chars[i], x + right_x, h + right_y);

            g.setColor(getForeground());
            g.drawString("" + chars[i], x, h);

            x += w;
        }
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT);
    }//end paintComponent()

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                RichJLabel label = new RichJLabel("76", -15);
                //drop shadow w/ highlight
                label.setLeftShadow(1, 1, Color.white);
                label.setRightShadow(2, 3, Color.black);
                label.setForeground(Color.gray);
                label.setFont(label.getFont().deriveFont(140f));
                // subtle outline
//                label.setLeftShadow(1, 1, Color.white);
//                label.setRightShadow(1, 1, Color.black);
//                label.setForeground(Color.blue);
//                label.setFont(label.getFont().deriveFont(140f));
                // 3d letters
//                label.setLeftShadow(5, 5, Color.white);
//                label.setRightShadow(-3, -3, new Color(0xccccff));
//                label.setForeground(new Color(0x8888ff));
//                label.setFont(label.getFont().deriveFont(140f));
                frame = new JFrame("RichJLabel hack");
                frame.getContentPane().add(label);
                frame.pack();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

    }
}
