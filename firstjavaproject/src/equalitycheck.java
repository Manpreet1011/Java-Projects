import java.sql.SQLOutput;
import java.util.Scanner;

public class equalitycheck {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter First number");
        number1 = read.nextInt();
        System.out.println("Enter Second number");
        number2 = read.nextInt();
        System.out.println("Enter Third number");
        number3 = read.nextInt();
        if ((number1 == number2)&&(number2 == number3)) {
            System.out.println("All three numbers are equal");
        } else
        System.out.println("Numbers are not equal");
    }
}


