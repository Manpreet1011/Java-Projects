import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExApplication {
    public static void main(String[] args) {
        String str="";
        Scanner reader = new Scanner(System.in);
        System.out.println("Entre 10 digit mobile number");
        str=reader.nextLine();
        Pattern pt= Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher mt= pt.matcher(str);
        if (mt.find())
        {
            System.out.println("Correct");

        }
        else
            System.out.println("Incorrect");


    }
}
