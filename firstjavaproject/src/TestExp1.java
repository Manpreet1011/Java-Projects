import java.io.IOException;

public class TestExp1 {
    public static void main(String[] args) {
        int j = 5;
        int k = 0;
        try {
            throw new MyException1("Hi there");
            //int i = j / k;

            //System.out.println("Result" + i);
        } catch (MyException1 e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally executed");
        }
        System.out.println("Next statement");
    }
}
    class MyException1 extends Exception{
        public MyException1(String msg)
        {
            super(msg);
        }
    }

