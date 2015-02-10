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
public class BaseBall extends Ball{

    /**
     *
     */
    public BaseBall(){
        super(2000);
        System.out.println("Hello from the BaseBall constructor");
    }
    public static void main(String... args){
     BaseBall baseball = new BaseBall();
    }
}
