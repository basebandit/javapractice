/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author mars
 */
public class Main extends Test {

    static int sum = 0;

    public static void main(String... args) {

//        String message = new Test() {
//
//            @Override
//            public String displayable(String message) {
//                return message; //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public int calculate(int a, int b) {
//                sum = a * b;
//                return sum;//To change body of generated methods, choose Tools | Templates.
//            }
//        }.displayable("Hello Evans");
        String message = new Main().displayable("Hello Evans");
        System.out.println(message);
//        sum = new Main().calculate(2, 2);

        System.out.println(sum);
    }

    @Override
    public String displayable(String message) {
        return message; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calculate(int a, int b) {
        return a * b; //To change body of generated methods, choose Tools | Templates.
    }

}
