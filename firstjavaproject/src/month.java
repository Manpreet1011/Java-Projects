
// Check the days in month
import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        checkMonth();
    }

    public static void checkMonth()
    {
        int month;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Month");
        month= read.nextInt();

        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
            System.out.println("Month has 31 days");
        }
        else if(month==4||month==6||month==9||month==11)
        {
            System.out.println("Month has 30 days");
        }
        else if (month==2)
        {
            System.out.println("Month has 28 days");
        }
        else
            System.out.println("Month should be between 1 to 12");

    }

}


