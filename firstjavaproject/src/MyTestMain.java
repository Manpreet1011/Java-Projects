import javax.imageio.IIOException;

public class MyTestMain {
    public static void main(String[] args) {
        MyTest test=new MyTest();
        //test.myMethod(2);
        try {
            test.myMethod(1);
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
    }
}
