/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mars.myswing;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;

/**
 *
 * @author mars
 */
public class JNumericField extends JTextField {

    private static final long serialVersionUID = 1L;

    private static final char DOT = '.';
    private static final char NEGATIVE = '-';
    private static final String BLANK = "";
    private static final int DEF_PRECISION = 2;

    public static final int NUMERIC = 2;
    public static final int DECIMAL = 3;

    public static final String FM_NUMERIC = "0123456789";
    public static final String FM_DECIMAL = FM_NUMERIC + DOT;

    private int maxLength = 0;
    private int format = NUMERIC;
    private String negativeChars = BLANK;
    private String allowedChars = null;
    private boolean allowedNegative = false;
    private int precision = 0;

    protected PlainDocument numberFieldFilter;

    public JNumericField() {
        this(2, DECIMAL);
    }

    public JNumericField(int iMaxLen) {
        this(iMaxLen, NUMERIC);
    }

    public JNumericField(int iMaxLen, int iFormat) {
//     setAllowedNegative(true);
//     setMaxLength(iMaxLen);
//     setFormat(iFormat);
//     
//     numberFieldFilter = new JNumberFieldFilter();
     
    }

}
