import java.util.Scanner;

public class stringconcatination {
    public static void main(String[] args) {
        String str1,str2;

        Scanner read = new Scanner(System.in);
        System.out.println("Enter String 1");
        str1= read.nextLine();
        System.out.println("Enter String 2");
        str2= read.nextLine();

        System.out.println("String after concatination " + Strincon(str1,str2));

    }
    static String Strincon(String x, String y)

    {
        return(x+" "+y);
    }
}
