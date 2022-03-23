import java.util.Scanner;

public class recBinSearch {
    public static void main(String[] args) {
        int arr[]=new int [10];
        Scanner read=new Scanner(System.in);
        System.out.println("Enter elements in ascending order ");
        for(int i=0;i<10;i++)
        {
            arr[i]= read.nextInt();
        }
        System.out.println("Enter element you want to search");
        int x= read.nextInt();
        int loc = binSearch(arr,0,10,x);
        System.out.println("Element found at Loc "+ loc);
    }
    public static int binSearch(int arr1[],int start, int end , int element){
        int mid=(start+end)/2;
        if(arr1[mid]==element)
        {
            return mid;
        }
        else if(start>=end)
            return -1;
        else if(element>arr1[mid])
        {
            start=mid+1;
            return binSearch(arr1,start,end,element);
        }
        else
        {
            end=mid-1;
            return binSearch(arr1,start,end,element);
        }

    }
}
