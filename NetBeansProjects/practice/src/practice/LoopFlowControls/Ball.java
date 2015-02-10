/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice.LoopFlowControls;

/**
 *
 * @author mars
 */
public class Ball {
    private final double weight;
   public Ball(double weight){
       this.weight = weight;
       System.out.println(weight);
       System.out.println("Hello from the Ball constructor");
   } 
   public static void hit(Ball b){
       System.out.println("You've hit a ball");
   }
   public static void main(String[] args){
   Ball c = new SoftBall();
   ((SoftBall) c).RiseBall(); 
   }
}
