
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

/**
 *
 * @author mars
 */
public class Regex {
    public static void main(String... args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    String s = doRegex();

                    // for(int i = 0;i<10;i++){
                    // int counter = Integer.parseInt(s);
                    for (int counter = Integer.parseInt(s); counter <= 30; counter++) {
                        System.out.println(counter);

                        // System.out.println(counter + i);
                        sleep(2000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t.start();
    }

    private static String doRegex() {
        String s = "2014-03-22";

        s = s.substring(s.length() - 2, s.length());

        return s;
    }
}

//for(int )


//~ Formatted by Jindent --- http://www.jindent.com
