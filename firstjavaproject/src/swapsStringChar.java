import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class swapsStringChar {
    public static void main(String[] args) {
        String str= "";
        int i,j;
        Scanner read=new Scanner(System.in);
        System.out.println("Enter any string");
        str=read.nextLine();
        System.out.println("Enter i and j ");
        i= read.nextInt();
        j= read.nextInt();
        System.out.println("After swapping characters" + swapStr(str,i,j));

    }
    public static String swapStr(String str1,int x,int y)
    {
        char arr[]=str1.toCharArray();

        char temp;
        temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
        return Arrays.toString(arr);

    }
}
