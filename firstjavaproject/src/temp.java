public class temp {
    public static void main(String[] args) {


        String s1 = "madam";
        char[] chars1 = s1.toCharArray();
        char s2[] = new char[s1.length()];
        System.out.println(s2.length);
        int length1 = chars1.length - 1;
        for (int i = 0; i <= length1; i++) {
            System.out.println(chars1[i]);
            s2[length1-i] = chars1[i];
            System.out.println(s2[length1-i]);
        }
        System.out.println("The reverse string is  :" + s2);
        System.out.println("S2="+s2);
        System.out.println("S1"+s1);
        if (s1.equals(s2)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}