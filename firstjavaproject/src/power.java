import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        int number, power;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number you want to fine the power of ");
        number = read.nextInt();
        System.out.println("Enter Power of number");
        power = read.nextInt();
        System.out.println(number + " to the power " + power + " = " + powerOf(number, power));
    }

    public static int powerOf(int num, int pow) {
        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result = num * result;
        }
        return(result);
    }
}
