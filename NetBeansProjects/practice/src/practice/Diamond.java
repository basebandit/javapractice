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
public class Diamond {
    static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
   public static void main(String[] args){
       //Draw a diamond using a symbol entered by a user
       String symbol1;//user input symbol to utilize
        System.out.println("Enter the symbol you wish to use");  
        symbol1 = getInput();//capture user input via the method
        for(int i = 0; i < 5; i++ ){//Begin for loop--increase until int is 5 long
            for (int k = 8; k > i; k--) {//nested loop--decrease space before int "i"
                System.out.print(" ");//print space from nested loop before symbol1
            }
         for(int j = 0; j <= i; j++){//increase j until its equal to "i"
             System.out.print(symbol1 + " ");//print symbol1 plus space to form a triangle
         }
            System.out.println();
        }
   } 
   public static String getInput(){
    while(true){
     try{
      return reader.readLine();
     }catch(java.io.IOException e){
         System.out.println(e.getStackTrace());
     }
    }
   }
}
