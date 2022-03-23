import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Person {
    Date birthdate;
    String name;


    public void setName()
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter name ");
        this.name=read.nextLine();

    }

    @Override
    public String toString() {
        return "Person{" +
                "birthdate=" + birthdate +
                ", name='" + name + '\'' +
                '}';
    }
    public int calculateAge()
    {
        Calendar today =Calendar.getInstance();
        Calendar birthday=new GregorianCalendar();
        birthday.setTime(birthdate);
        int yearDiff=today.get(Calendar.YEAR)-birthday.get(Calendar.YEAR);
        if(today.get(Calendar.MONTH)<birthday.get(Calendar.MONTH))
        {
            yearDiff=yearDiff-1;
        }
        else if (today.get(Calendar.MONTH)==birthday.get(Calendar.MONTH)&&today.get(Calendar.DATE)<birthday.get(Calendar.DATE))
        {
            yearDiff=yearDiff-1;
        }
        return yearDiff;
    }
    public void setBirthDate()
    {
        int iYear,iMonth,iDay;
       //String date="";
        Scanner read=new Scanner(System.in);
        System.out.println("Enter Birth year in YYYY-MM-DD");
       // date = read.nextLine();
        iYear=read.nextInt();
        System.out.println("Enter Birth Month in MM");
        iMonth=read.nextInt();
        System.out.println("Enter Birth date in DD ");
        iDay= read.nextInt();
        Calendar cal=Calendar.getInstance();
        cal.set(iYear, iMonth, iDay);
        this.birthdate=cal.getTime();
        System.out.println(cal.getTime());

    }
    public Date getBirthdate()
    {

        return birthdate;
    }
}
