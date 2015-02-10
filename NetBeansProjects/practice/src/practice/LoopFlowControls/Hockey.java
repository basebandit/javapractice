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
public class Hockey extends BaseBall{
    public Hockey(){
        System.out.println("Hello from the Hockey constructor");
    }
    public static void main(String...args){
      Hockey hockey = new Hockey();
      Hockey b = new Hockey();
      hit(b);
      Ball b1 = b;
      hit(b1);
     }
}
