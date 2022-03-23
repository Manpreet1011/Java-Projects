public class StaticPractice {
     private static int x=10;
     private int y=15;
     static void display()
    {
        System.out.println("Static member in Static Method x== "+ x );
       // System.out.println("Non Static member in Static Method y=="+y);
    }
    public void displayCall()
    {
        System.out.println("Non Static member in non Static method  y== " + y);
        System.out.println("Static member in non static method x=="+x);
       display();
    }
    public static void display1()
    {
        System.out.println("Calling another static method ");
        display();
    }
}
