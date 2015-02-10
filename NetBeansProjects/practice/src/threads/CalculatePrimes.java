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
public class CalculatePrimes extends Thread {

    private static final int MAX_PRIMES = 1000000;
    private static final int TEN_SECONDS = 10000;
    private volatile boolean finished = false;

    @Override
    public void run() {
        int[] primes = new int[MAX_PRIMES];
        int count = 0;

        for (int i = 2; count < MAX_PRIMES; i++) {
            //check to seee if the timer has expired
            if (finished) {
                break;
            }
            boolean prime = true;
            for (int j = 0; j < count; j++) {
                if (i % primes[j] == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primes[count++] = i;
                System.out.println("Found prime: " + i);
            }
        }
    }

    public static void main(String[] args) {
        CalculatePrimes calculator = new CalculatePrimes();
        calculator.start();
        try {
            Thread.sleep(TEN_SECONDS);
        } catch (InterruptedException e) {
            //fall through
            System.out.println("Silly");
        }
        calculator.finished = true;
    }
}
