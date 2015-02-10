/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networks;

import java.net.*;
import java.util.*;

/**
 *
 * @author mars
 */
public class IPFinder {

    public static void main(String[] args) {
        String host;
        Scanner input = new Scanner(System.in);
        InetAddress address;
        System.out.println("******WELCOME TO THE JAVA IPFINDER*******");
        System.out.println("\n\nEnter host name: ");
        host = input.next();
        try {
            address = InetAddress.getByName(host);
            System.out.println("IP address: " + address.toString());
        } catch (UnknownHostException uhEx) {
            System.out.println("Could not find " + host);
        }
    }
}
