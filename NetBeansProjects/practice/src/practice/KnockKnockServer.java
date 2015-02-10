/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author admin
 */
public class KnockKnockServer {

    public static void main(String[] args) throws java.io.IOException {

        java.net.ServerSocket serverSocket = null;
        try {
            serverSocket = new java.net.ServerSocket(4444);
        } catch (java.io.IOException e) {
            System.err.println("Could not listen on port: 4444.");
            System.exit(1);
        }

        java.net.Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (java.io.IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }

        java.io.PrintWriter out = new java.io.PrintWriter(
                clientSocket.getOutputStream(),
                true);
        java.io.BufferedReader in = new java.io.BufferedReader(
                new java.io.InputStreamReader(
                clientSocket.getInputStream()));
        String inputLine, outputLine;
        KnockKnockProtocol kkp = new KnockKnockProtocol();

        outputLine = kkp.processInput(null);
        out.println(outputLine);

        while ((inputLine = in.readLine()) != null) {
            outputLine = kkp.processInput(inputLine);
            out.println(outputLine);
            if (outputLine.equals("Bye.")) {
                break;
            }
        }
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
}
