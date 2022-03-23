public class MyException {
    static void checkEligibility(int age, int weight) {
        if (age < 24 && weight < 40) {
            throw new ArithmeticException("Not Eligible");
        } else {
            System.out.println("Student eligible");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to registration process");
        checkEligibility(22, 16);
    }
}
