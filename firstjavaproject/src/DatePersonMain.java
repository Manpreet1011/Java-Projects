import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Scanner;

public class DatePersonMain {
    public static void main(String[] args) {
        Person p= new Person();
        p.setName();
        p.setBirthDate();


       // p.setBirthDate(1977,11,10);
        System.out.println(p.calculateAge());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd");
        System.out.println(p.getBirthdate());

    }
}
