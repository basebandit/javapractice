/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Buffered I/O stream
 *
 * Buffered input streams read data from a memory area known as a buffer; the
 * native input API is called only when the buffer is empty. Similarly, buffered
 * output streams write data to a buffer, and the native output API is called
 * only when the buffer is full.
 *
 * @author mars
 */
public class BufferedByteStream {

    public static void main(String[] args) throws IOException {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream("/home/mars/NetBeansProjects/practice/src/unbufferedio/xanadu.txt"));
            out = new BufferedOutputStream(new FileOutputStream("/home/mars/NetBeansProjects/practice/src/bufferedio/bufferedbytes.txt"));
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
