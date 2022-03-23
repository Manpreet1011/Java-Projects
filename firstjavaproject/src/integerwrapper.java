import java.util.Locale;

public class integerwrapper {
    public static void main(String[] args) {
        Integer i=10;
        String s="abd";
        System.out.println("Byte value of "+i+ " is " + i.byteValue());
        System.out.println("String value of "+i+ " is " + i.toString());
        System.out.println("Double value of "+i+ " is " + i.doubleValue());
        //System.out.println("Integer  value of "+s+ " is " + Integer.parseInt(s));
        System.out.println("Hash code   of "+i+ " is " + i.hashCode());
        System.out.println("Comparison value of "+i+ " is " + i.compareTo(90));
        System.out.println("Short value of "+i+ " is " + i.shortValue());

        System.out.println("Upper case  of "+s+ " is " + s.toUpperCase());
        System.out.println("Bytes of "+s+ " is " + s.getBytes());

    }
}
