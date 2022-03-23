import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
    public static void main(String[] args) {
        String phoneNo = "aanaaankakjaa";
        validatePhoneNo(phoneNo);
//        Scanner read = new Scanner(System.in);
//        System.out.println("Enter phone number");
//        phoneNo= read.nextLine();
        //   System.out.println(validatePhoneNo(phoneNo));
//        String re="\\D";
//        int count = 0;
////        Pattern pt = Pattern.compile("ab");// pattern to be matched
//        Matcher mt = pt.matcher("ababbaabbaba");//String in which to match pattern
//        while (mt.find()) {
//            count++;
//            System.out.println("Starts at " + mt.start() + " Ends at " + mt.end() + "...." + mt.group());
//        }
//        System.out.println("Pattern occurs " + count + " times");
    }

    public static void validatePhoneNo(String phoneNo) {
        Pattern p = Pattern.compile("a?");
        Matcher m = p.matcher(phoneNo);
        while ((m.find())) {
            System.out.println(m.start() + "......" + m.group());
        }

    }
}
