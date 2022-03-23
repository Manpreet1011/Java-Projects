import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class getSandwich {
    public String getSandwich1(String str) {
        Pattern p = Pattern.compile("bread");
        Matcher m = p.matcher(str);
        String str1 = "";
        int x = 0, i = 0;
        while (m.find()) {

            if (i == 0) {
                i = m.end();

            }
            if (i != 0)
                x = m.start();
        }
        if ((i != 0) && (x != 0))
            str1 = str.substring(i, x);
        return str1;
    }

}
