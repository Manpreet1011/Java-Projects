import java.util.Scanner;

public class rectanglearea {
    public static void main(String[] args) {
        int length,breadth,area;
        Scanner read =new Scanner(System.in);
        System.out.println("Enter Length of Rectangle");
        length=read.nextInt();
        System.out.println("Enter Breadth of Number");
        breadth=read.nextInt();
        area= Rectarea(length,breadth);
        System.out.println("Area of triangle= " + area);
    }
    public static int Rectarea( int x, int y)
    {
        return(x*y);
    }
}
