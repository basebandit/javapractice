/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author mars
 */
public class ListDirectoryWIthFilter {

    public static void main(String[] args) {
        File dir = new File("/home/mars/NetBeansProjects/practice/src/practice");
        if (dir.isDirectory()) {
            //List only files that meet the following filtering criteria
            //programmed in accept() method of FilenameFilter
            String[] files = dir.list(new FilenameFilter() {
                public boolean accept(File dir, String file) {
                    return file.endsWith(".java");
                }
            });
            for (String file : files) {
                System.out.println(file);
            }
        }
    }
}
