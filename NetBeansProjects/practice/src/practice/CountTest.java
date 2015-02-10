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
public class CountTest {
   private static int instanceCount = 0;
   
   public CountTest(){
    instanceCount++;
   }

    /**
     *
     * @return
     */
    public static int getInstanceCount(){
    return instanceCount;
   }
}
