import java.util.regex.Pattern;

public class StringRegExDemo {
    public static void main(String[] args) {
        String str = "www.google.com";
        Pattern pt = Pattern.compile("[.]");
        String s[] = pt.split(str);
//        for (String st : s) {
//            System.out.println(st);
//        }
        String ss[]=str.split("[.]");
        for(String s1 : ss)
        {
            System.out.println(s1);
        }
    }
}
