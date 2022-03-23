public class ReverseString {
    public static void main(String[] args) {
        String str = "ahdhasdhasdhaman";
        System.out.println("Reverse of String is " + revStr(str));
    }

    public static String revStr(String str) {

        int length = str.length();
        //char arr[] ="arrttyuyuyiuyuo";
        String str1 = "";
        for (int i = length - 1; i >= 0; i--)
            str1 = str1 + str.charAt(i);
        return str1;
    }
}
