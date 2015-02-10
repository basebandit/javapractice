
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

/**
 *
 * @author mars
 */
public class BallFactoryInstance {
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static Ball getBall(String s) {
        if (s.equalsIgnoreCase("BaseBall")) {
            return new BaseBall();
        }

        if (s.equalsIgnoreCase("SoftBall")) {
            return new SoftBall();
        }

        return null;
    }

    /**
     *
     * @param args
     */
    public static void main(String... args) {
        System.out.println("Choose a game to play:\tBaseBall \n\t\t\tSoftBall");

        String userChoice = sc.next();
        Ball   b          = BallFactoryInstance.getBall(userChoice);

        if (b.equals(new BaseBall())) {
            System.out.println("You have chosen BaseBall");
        } else if (b.equals(new SoftBall())) {
            System.out.println("You have chosen SoftBall");
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
