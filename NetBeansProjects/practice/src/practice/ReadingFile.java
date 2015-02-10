/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author mars
 */
public class ReadingFile {

    static java.io.BufferedReader reader = null;

    public static void main(String[] args) {
        try {
            String sCurrentLine;
            reader = new java.io.BufferedReader(new java.io.FileReader("/home/mars/NetBeansProjects/practice/src/practice/mwas.txt"));
            while ((sCurrentLine = reader.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (java.io.IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
