/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author mars
 */
public class Undergraduate extends Student {

    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

    @Override
    public void computeCourseGrade() {
        int total = 0;
        for (int i = 0; i < NUM_OF_TESTS; i++) {
            System.out.println(String.format("UNDERGRADUATE %s", i));
            System.out.println(String.format("Enter mark for test %s ", i));
            int mark = getMark();
            System.out.println(String.format("Marks for test %s is %s ", i, mark));
            test[i] = mark;
            total += test[i];
            System.out.println(String.format("Total mark for test %s is %s ", i, mark));
        }
        if (total / NUM_OF_TESTS >= 70) {
            courseGrade = "Pass";
            System.out.println(courseGrade);
        } else {
            courseGrade = "Fail";
            System.out.println(courseGrade);
        }
    }

    public int getMark() {
        while (true) {
            try {
                int mark = Integer.parseInt(reader.readLine());
                return mark;
            } catch (java.io.IOException e) {
                System.out.println("Invalid Mark");
            }
        }
    }

    public static void main(String... args) {
        //Student me = new Student();
        //System.out.println(me.getName());
        Undergraduate undergrad = new Undergraduate();
        undergrad.computeCourseGrade();
    }
}
