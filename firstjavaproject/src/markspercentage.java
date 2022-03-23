import java.util.Scanner;

public class markspercentage {
    public static void main(String[] args) {
        int marks[];
        marks = new int[5];
        Scanner read = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects");
        for (int n = 0; n < 5; n++) {
            System.out.println("Enter marks of Subject " + (n + 1));
            marks[n] = read.nextInt();
        }
        percentage(marks);
    }

    public static void percentage(int _marks[]) {
        int sum = 0;
        float percentage;
        for (int x = 0; x < 5; x++) {
            sum = sum + _marks[x];
        }
        percentage = 100 * sum / 500;
        System.out.println("Percentage marks =" + percentage);
        if (percentage >= 80) {
            System.out.println("Got Grade A");
        } else if (percentage >= 70 && percentage < 80)
            System.out.println("Got Grade B");
        else if (percentage >= 60 && percentage < 70)
            System.out.println("Got Grade C");
        else
            System.out.println("Grade D");
    }
}
