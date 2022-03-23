import java.util.Scanner;

public class circlearea {
    public static void main(String[] args) {
        int radius;
        float area;
        Scanner read=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        radius=read.nextInt();
        area=Carea(radius);
        System.out.println("Area of circle = " + area);
    }
    public static float Carea(int x)
    {
        return (float) (2*3.14*x*x);
    }
}
