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
public class SomeClass implements Runnable {
//Provide implementation to abstract method run()

    private String name;
    private int count;

    public SomeClass(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override

    public void run() {
        //Thread's running behavior
        for (int i = 0; i < count; i++) {
            System.out.println("Hey am " + name + "\t\t" + i);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                System.out.println("A thread was interrupted");
//            }
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[]{new Thread(new SomeClass("Thread1", 2)), new Thread(new SomeClass("Thread3", 3)), new Thread(new SomeClass("Thread5", 4)), new Thread(new SomeClass("Thread4", 6))};
        System.out.println("Thread Name " + "\t" + "Number of Counts");
        for (Thread t : threads) {
            t.start();
        }
        //
    }
}
