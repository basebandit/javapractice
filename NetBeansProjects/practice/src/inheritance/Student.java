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
public class Student {
//int low = 1;
//// the lowest value in the range
//int high = 6;
//// the highest value in the range
//int rnd = (int)(Math.random() * (high – low + 1)) + low;

    protected final static int NUM_OF_TESTS = 3;
    protected String name;
    protected int[] test;
    protected String courseGrade;
    private final static int num = (int) (Math.random() * 2) + 1;
    static Student[] roster = new Student[4];

    public Student(String studentName) {
        name = studentName;
        test = new int[NUM_OF_TESTS];
        courseGrade = "****";
    }

    public Student() {
        this("No name");
    }

    public static Student getStudentType() {
        // Student type;
        for (int i = 0; i < 4; i++) {
            if (num == 1) {
                roster[i] = new Undergraduate();
                return roster[i];
            } else if(num == 2){
                roster[i] = new GraduateStudent();
                return roster[i];
            }
        }
        return null;

    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public String getName() {
        return name;
    }

    public int getTestScore(int testNumber) {
        return test[testNumber - 1];
    }

    public void setNumberOfTests(int number) {
        number = NUM_OF_TESTS;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setTestScore(int testNumber, int testScore) {
        test[testNumber - 1] = testScore;
    }

    public void computeCourseGrade() {
        //do nothing - override this method in the subclass
    }

    public static void main(String[] args) {
        int underGradCount = 0;
        int gradCount = 0;
        for (int i = 0; i < 4; i++) {
            Student stud = new Student();
            getStudentType().computeCourseGrade();
            Student student = getStudentType();
            if (student instanceof Undergraduate) {
                underGradCount++;
                System.out.println("There are: " + underGradCount + " undergraduates");
            } else if (student instanceof GraduateStudent) {
                gradCount++;
                System.out.println("There are: " + gradCount + " Graduates");
            }
        }
    }
}
