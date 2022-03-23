import java.util.Scanner;

public class checknumber {
    public static void main(String[] args) {
        {
            Scanner read = new Scanner(System.in);
            System.out.println("Enter any number");
            int num = read.nextInt();
            if (num > 0 && num <= 100)
                System.out.println("Congrats you are in range ");
            else
                System.out.println("Sorry you ara not in range");
        }
    }
}
