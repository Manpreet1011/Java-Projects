import java.util.Scanner;

public class gcdEuclidean {
    public static void main(String[] args) {
        int a, b;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter two numbers for which you want to find greatest common divisor");
        a = read.nextInt();
        b = read.nextInt();
        int result = gcd(a, b);
        System.out.println("Greatest common divisor is " + result);
    }

    public static int gcd(int m, int n) {
        if (m == n)
            return m;
        else if (m < n)
            return gcd(m, n - m);
        else
            return gcd(m - n, n);
    }
}
