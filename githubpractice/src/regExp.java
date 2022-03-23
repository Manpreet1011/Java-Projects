import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExp {
    public static void main(String[] args) {
        Pattern pt=Pattern.compile("a");
        Matcher mt= pt.matcher("asdsdasasadasadasasa");
        while (mt.find())
        {
            System.out.println(mt.start());//kjgkjggitkjk
            System.out.println(mt.groupCount());
        }
    }
}
