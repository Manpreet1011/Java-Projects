import java.util.Scanner;

public class ArrUtil {

    public static void main(String[] args) {
        int arr[] = new int[5];
        int n,index;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Elements of an array");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element number " + (i + 1));
            arr[i] = read.nextInt();
        }

        System.out.println("Enter element whose index you want to search");
        n=read.nextInt();
        index=indexOfArr(arr,n);
        if(index==-1)
            System.out.println("Element not in list");
        else
        System.out.println("Element found at loc " + index);
        System.out.println("Enter index you want to search");
        n= read.nextInt();
        System.out.println(integerAt(arr, n));
        System.out.println("Enter element you want to search");
        n= read.nextInt();
        index = containsInt(arr,n);
        if(n==-1)
            System.out.println("Cannot find element in an array ");
        else
            System.out.println("Array contains "+n + " at "+" location "+ index);


    }
    public static int indexOfArr(int arr1[], int x)
    {
        int i;

        for(i=0;i<arr1.length;i++) {
            if (arr1[i] == x) {
                return (i);
            }
        }
            return -1;
}

public static int integerAt(int arr1[],int x){
        if((x<arr1.length)&&(x>=0))
        return arr1[x];
        else
            return -1;


}
public static int containsInt(int arr1[],int x){
        for(int z=0;z<arr1.length;z++)
        {
            if(arr1[z]==x)
                return z;
        }
        return -1;
}

}

