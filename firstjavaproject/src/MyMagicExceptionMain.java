public class MyMagicExceptionMain {
    public static void magic(int num) throws MyMagicException {
        if (num == 1) {
            throw (new MyMagicException("Well done its magic"));
        }
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        try {
            magic(2);
            magic(1);
        } catch (MyMagicException e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
