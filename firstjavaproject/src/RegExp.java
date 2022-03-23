import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        String str1 = "";
        String str = "zap kjkshzipldad zop";
        Pattern p = Pattern.compile("z.p");
        Matcher m = p.matcher(str);
        while (m.find()) {
            //  System.out.println(m.start());

            str1 = str1 + m.replaceAll("zp");
        }
        System.out.println(str1);
        getSandwich s = new getSandwich();
        System.out.println(s.getSandwich1("breadjambread"));

    }
}



