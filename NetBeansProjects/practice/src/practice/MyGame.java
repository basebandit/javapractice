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
public class MyGame {

    static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    static char ch, answer = 'k';
    static char input;

    public static void main(String args[]) throws java.io.IOException {

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.println("Can you guess it: ");

        ch = (char) Integer.parseInt(reader.readLine());
        if (ch == answer) {
            System.out.println("***Right***");
        } else if (ch != answer) {
            System.out.println("***Sorry You are wrong..Enter a letter***");
            java.io.BufferedReader InputReader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

            while (true) {

                try {
                    input = (char) System.in.read();
//                    
                } catch (java.io.IOException e) {
                    System.err.println("Wrong answer...Try again");
                }
                if (input == answer) {
                    System.out.println("***Right***");
                }
            }

        }
    }
}

//    public static char getAnswer() {
//        while (true) {
//            try {
//                char ans = (char) Integer.parseInt(InputReader.readLine());
//                return ans;
//            } catch (IOException e) {
//                System.err.println("Wrong answer...Try again");
//            }
//        }
//    }

