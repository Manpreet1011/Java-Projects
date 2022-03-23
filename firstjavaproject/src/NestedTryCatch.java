public class NestedTryCatch {
    public static void main(String[] args) {
        int x = 5;
        int z = 0;
        int arr[] = new int[5];
        try {
            System.out.println("Try block 1");
            try {
                System.out.println("Try block 2");
                System.out.println(x / z);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in try block 2");
            }
        } catch (Exception e) {
            System.out.println("Outer try");
        }
    }

    }


