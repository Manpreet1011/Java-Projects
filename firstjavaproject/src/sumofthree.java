import java.util.Scanner;

public class sumofthree {
    public static void main(String[] args) {
        int number1,number2,number3;
        Scanner read=new Scanner(System.in);
        System.out.println("Enter three numbers");
        number1= read.nextInt();
        number2= read.nextInt();
        number3= read.nextInt();
        int result= sum(number1,number2,number3);
        System.out.println("Sum of three numbers =" + result);
    }
    public static int sum(int x,int y, int z)
    {
        return(x+y+z);
    }
}
