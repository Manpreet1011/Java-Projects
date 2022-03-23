public class Xyzmiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AxyzBBB"));
    }
    public static boolean xyzMiddle(String str) {
        int len=str.length();
        int i=str.indexOf("xyz");
        int mid=len/2;
        if((i>=mid-1)&&(i<=mid-2))
            return true;
        else
            return false;
    }
}
