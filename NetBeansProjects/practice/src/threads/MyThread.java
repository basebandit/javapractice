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
public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    //Override the run() method to specify the thread's running behavior
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(name + ": " + i);
            yield();
        }
    }

    public static void main(String[] args) {
        Thread[] threads = {
            new MyThread("Thread1"),
            new MyThread("Thread2"),
            new MyThread("Thread3")
        };
        for (Thread t : threads) {
            t.start();
        }
    }
}
