/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author mars
 */
public class TaskThread {

    Runnable printA;
    Runnable printB;
    Runnable print100;

    public TaskThread() {
        printA = new PrintChar('a', 100);
        printB = new PrintChar('b', 100);
        print100 = new PrintNum(100);
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    class PrintChar implements Runnable {

        private final char charToPrint;
        private final int times;

        public PrintChar(char c, int t) {
            charToPrint = c;
            times = t;
        }

        @Override
        public void run() {
            for (int i = 0; i < times; i++) {
                System.out.print(charToPrint);
            }
        }
    }

    class PrintNum implements Runnable {

        private final int lastNum;

        public PrintNum(int n) {
            lastNum = n;
        }

        @Override
        public void run() {
            for (int i = 0; i < lastNum; i++) {
                System.out.print(" " + i);
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        new TaskThread();
    }
}
