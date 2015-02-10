/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author mars
 */
public class BubbleSort {

    private void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            //Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {

                if (list[i] > list[i + 1]) {
                    //swap list[i] with list[i+1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;//Next Pass still needed
                }
            }
        }
        /*
         * A test Method*
         */
    }

    public static void main(String[] args) {
        int[] list = new int[]{2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        new BubbleSort().bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

}
