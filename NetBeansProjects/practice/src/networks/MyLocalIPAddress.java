/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networks;

import java.net.*;

/**
 *
 * @author mars
 */
public class MyLocalIPAddress {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
        } catch (UnknownHostException uhEx) {
            System.out.println("Could not find local host address");
        }
    }
}
