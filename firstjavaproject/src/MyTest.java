import java.io.IOException;

public class MyTest {
    void myMethod(int num) throws IOException,ClassNotFoundException{
        if(num==1)
            throw new IOException("I/O exception occurred");
        else
            throw new ClassNotFoundException("Class not found Exception");
    }

}
