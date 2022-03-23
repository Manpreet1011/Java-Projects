import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int nums[]=new int[10];
        Arrays.fill(nums,2,5,4);
        System.out.println(Arrays.toString(nums));
        int arr[]= Arrays.copyOf(nums,3);
        //Arrays.c
        System.out.println(Arrays.toString(arr));
    }
}
