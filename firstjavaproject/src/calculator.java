//import javax.lang.model.element.ModuleElement;
import java.util.Scanner;
//manpreet
public class calculator {
    public static void main(String[] args) {
        int number1,number2,result;
        int option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Just update for git");
        while(true) {
            System.out.println("Please select your option");
            System.out.println("1. For Addition");
            System.out.println("2. For Subtraction");
            System.out.println("3. For Multiplication");
            System.out.println("4. For Division");
            System.out.println("5. For Square of Number");
            System.out.println("6. For Square root of Number");
            System.out.println("0. To exit ");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter two numbers");
                    number1 = scan.nextInt();
                    number2 = scan.nextInt();
                    System.out.println("Sum of two numbers =" + Addition(number1, number2));
                    break;
                case 2:
                    System.out.println("Enter two numbers");
                    number1 = scan.nextInt();
                    number2 = scan.nextInt();
                    System.out.println("Subtraction of two numbers =" + Subtraction(number1, number2));
                    break;
                case 3:
                    System.out.println("Enter two numbers");
                    number1 = scan.nextInt();
                    number2 = scan.nextInt();
                    System.out.println("Subtraction of two numbers =" + Multiplication(number1, number2));
                    break;

                case 4:
                    System.out.println("Enter two numbers");
                    number1 = scan.nextInt();
                    number2 = scan.nextInt();
                    System.out.println("Subtraction of two numbers =" + Division(number1, number2));
                    break;
                case 5:
                    System.out.println("Enter  numbers");
                    number1 = scan.nextInt();
                    System.out.println("Subtraction of two numbers =" + Square(number1));
                    break;
                case 6:
                    System.out.println("Enter  numbers");
                    number1 = scan.nextInt();
                    System.out.println("Subtraction of two numbers =" + SquareRoot(number1));
                    break;
                case 0:
                    System.exit(0);
            }

            }

        }

            public static int Addition(int x,int y)
            {
                return (x + y);
            }
            public static int Subtraction(int x, int y)
            {
                return (x - y);
            }
            public static int Multiplication(int x,int y)
            {
                return(x*y);
            }
            public static int Division(int x,int y)
            {
                return(x/y);
            }
            public static int Square(int x)
            {
                return(x*x);
            }

            public static double SquareRoot(int x)
            {
                return(Math.sqrt(x));
            }

    }
