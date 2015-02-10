/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author mars
 */
public class StartingPoint {

    static java.util.Scanner InputFromUser = new java.util.Scanner(System.in);

    public static void main(String mwas[]) {
        int start = 0;
        int finish;
        if (InputFromUser.hasNextInt()) {
            finish = InputFromUser.nextInt();
            System.out.println("Enter a string");
        } else {
            finish = 1;
            System.out.println("Play by the rules,Enter a string:");
        }
        java.util.Scanner InputWords = new java.util.Scanner(System.in);
        String words = InputWords.nextLine();
        while (start < finish) {
            System.out.println(words);
            start += 1;
        }
    }
}
