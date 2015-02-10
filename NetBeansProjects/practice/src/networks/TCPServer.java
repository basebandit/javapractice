/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networks;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author mars
 */
public class TCPServer {
    
    public static void main(String[] args) {
        try {
            String clientSentence;
            String capitalizedSentence;
            int clientPort = networks.TCPClient.usrPort;
            ServerSocket welcomeSocket = new ServerSocket(clientPort);
            while (true) {
                Socket connSocket = welcomeSocket.accept();
                BufferedReader inFrmClient = new BufferedReader(new InputStreamReader(connSocket.getInputStream()));
                DataOutputStream outToClient = new DataOutputStream(connSocket.getOutputStream());
                clientSentence = inFrmClient.readLine();
                capitalizedSentence = clientSentence.toUpperCase() + "\n";
                outToClient.writeBytes(capitalizedSentence);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
