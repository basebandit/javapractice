/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.File;

/**
 * Recursively list the contents of a directory (Unix's "ls -r" command).
 *
 * @author mars
 */
public class ListDirectoryRecursive {

    public static void main(String[] args) {
        File dir = new File("/home/mars/");
        listRecursive(dir);
    }

    public static void listRecursive(File dir) {
        if (dir.isDirectory()) {
            File[] items = dir.listFiles();
            for (File item : items) {
                System.out.println(item.getAbsoluteFile());
                if (item.isDirectory()) {
                    listRecursive(item);//Recursive call
                }
            }
        }
    }
}
