/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author admin
 */
public class KnockKnockClient {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) throws java.io.IOException {

        java.net.Socket kkSocket = null;
        java.io.PrintWriter out = null;
        java.io.BufferedReader in = null;
        String serverAddress = sc.next();
        try {

            kkSocket = new java.net.Socket(serverAddress, 4444);
            out = new java.io.PrintWriter(kkSocket.getOutputStream(), true);
            in = new java.io.BufferedReader(
                    new java.io.InputStreamReader(kkSocket.getInputStream()));
        } catch (java.net.UnknownHostException e) {
            System.err.println("Don't know about host: Kali.");
            System.exit(1);
        } catch (java.io.IOException e) {
            System.err.println("Couldn't get I/O for the"
                    + " connection to: KIKI.");
            System.exit(1);
        }

        java.io.BufferedReader stdIn = new java.io.BufferedReader(
                new java.io.InputStreamReader(System.in));
        String fromServer;
        String fromUser;

        while ((fromServer = in.readLine()) != null) {
            System.out.println("Server: " + fromServer);
            if (fromServer.equals("Bye.")) {
                break;
            }

            fromUser = stdIn.readLine();
            if (fromUser != null) {
                System.out.println("Client: " + fromUser);
                out.println(fromUser);
            }
        }

        out.close();
        in.close();
        stdIn.close();
        kkSocket.close();
    }
}
