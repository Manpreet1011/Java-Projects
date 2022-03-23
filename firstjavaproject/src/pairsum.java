import java.util.Scanner;

public class pairsum {
    public static void main(String[] args) {
        int number[] = new int[10];
        int sum;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number " + (i + 1) + " = ");
            number[i] = read.nextInt();
        }
        System.out.println("Enter sum for which you want to find the pair");
        sum = read.nextInt();
        int flag = 0;
        for (int i = 0; i < 10; i++) {
            for (int y = i + 1; y < 10; y++) {
                if ((number[i] + number[y]) == sum) {
                    System.out.println(number[i] + " + " + number[y] + " = " + sum);
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("No numbers with sum " + sum);
        }


    }
}
