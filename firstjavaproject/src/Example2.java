import java.util.function.DoubleToIntFunction;

public class Example2 {
    public static void main(String[] args) {
        try {
            int a[] = new int[7];
            a[8] = 30 / 10;
            System.out.println("First print statement in try block");
        } catch (ArithmeticException e) {
            System.out.println("Warning Arithmetic exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning Array Index out of bound exception");
        } catch (Exception e) {
            System.out.println("Some other exception");
        }
        finally {
            System.out.println("Execute these lines after exception is caught");
        }
    }
}
