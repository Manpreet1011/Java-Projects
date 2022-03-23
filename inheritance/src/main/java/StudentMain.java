public class StudentMain {
    public static void main(String[] args) {

        Person p=new Person("Abhay","khangura",145);
        Student s1 = new Student("Manpreet", "Khangura", 1233455, 123, 95);
        Student s=new Student();
        s1.displayData();
        System.out.println("Person display data called");
        p.displayData();
        System.out.println("Student display data called");
        s.displayData();
        System.out.println(p.getFirstName());

    }
}
