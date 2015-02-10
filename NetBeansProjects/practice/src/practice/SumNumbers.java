package practice;

public class SumNumbers {

    static java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    static int num1, num2;
    static int sum = 0;

    public static void main(String[] args) throws java.io.IOException {

        System.out.println("Enter num1");
        num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter num2");
        num2 = Integer.parseInt(br.readLine());
        sum = add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    }

    /**
     *
     * @param n1
     * @param n2
     * @return
     */
    public static int add(int n1, int n2) {
        return n1 + n2;
    }
}
