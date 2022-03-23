import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowException {

    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println("In Interrupt exception");
            System.out.println(e.getMessage());
        }
        System.out.println("Hello");
        try {
            FileReader read = new FileReader("Txt.txt");
            BufferedReader fileInput = new BufferedReader(read);
            System.out.println(fileInput.read());
        }
        catch (IOException e)
        {
            System.out.println("In I/O Exception");
            System.out.println(e.getMessage());
        }
        finally {

            System.out.println("Finally out");

            //fileInput.close();
        }
    }
}
