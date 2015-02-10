/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.File;

/**
 *
 * @author mars
 */
public class MyFile {

    public static void main(String[] args) {
        File file = new File("/home/mars/final-wordlist.txt");
        System.out.println(file.isFile());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
    }
}
