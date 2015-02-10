package practice;

public class ExpressionGanging{
  public static void main(String[] args){
    for(int count = 10; count >= 0; System.out.println((count == 8)?"Ignition sequence start":count+"..."),count--);{
     System.out.println("All engines Running");
     System.out.println("LiftOff!We have a lift off");
    }
  }
}