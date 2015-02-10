package practice;



public class KeyBoardInput{
  public static void main(String []args)throws java.io.IOException{
  String name;
  java.io.InputStreamReader is = new java.io.InputStreamReader(System.in);
  java.io.BufferedReader br = new java.io.BufferedReader(is);
  System.out.println("Enter Your Name");
  name = br.readLine();
  System.out.println("Your Name is "+name);
  }
}