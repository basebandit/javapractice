/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davy;

/**
 *
 * @author mars
 */
public class Children {

    private static String name;

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int James, Christine, Joy;
        James = 6;
        Christine = James - 2;
        Joy = Christine + 4;
        int Older = (James > Christine) ? James : Christine;
        int Oldest = (Older > Joy) ? Older : Joy;
        if (Oldest == Joy) {
            name = "Joy";
        } else {
            name = "";
        }

        System.out.println(
                "*****************Analysis*********************");
        System.out.print(
                "James\t\tChristine\t\tJoy\n");
        System.out.print(
                " " + James + "\t\t  " + Christine + "\t\t\t " + Joy + "\n");
        System.out.println(
                "Oldest: " + name + "= " + Oldest);
    }
}
