/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networks;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import java.net.Socket;

/**
 *
 * @author mars
 */
public class TCPClient {

    static int usrPort;

    public static void main(String[] args) {
        try {
            BufferedReader inFrmUser = new BufferedReader(new InputStreamReader(System.in));
            String sentence;
            String modifiedSentence;
            String usrIpAddr;
            JOptionPane.showInputDialog(null, "Enter Your IP Address");
            usrIpAddr = inFrmUser.readLine();
            JOptionPane.showInputDialog(null, "Enter Port You Wish To Use For Communication");
            usrPort = Integer.parseInt(inFrmUser.readLine());
            for (int i = 0; i < 10; i++) {
                try (Socket clientSocket = new Socket(usrIpAddr, usrPort)) {
                    DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
                    BufferedReader inFrmServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    sentence = inFrmUser.readLine();
                    outToServer.writeBytes(sentence + "\n");
                    modifiedSentence = inFrmServer.readLine();
                    System.out.println("FROM SERVER:" + modifiedSentence);
                }
            }
        } catch (HeadlessException | IOException | NumberFormatException e) {
            //System.out.println("Server Error");
            e.printStackTrace();
        }
    }
}
