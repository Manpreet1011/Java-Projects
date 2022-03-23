public class StudentMain {
    public static void main(String[] args) {
        Student s=new Student("Manpreet","Kitchener");
        System.out.println(s);
        Student s1=new Student("Abaay","Kitchener");
        System.out.println(s1);
        s1.setAddress("Brampton");
        System.out.println(s1);
        System.out.println("Name= "+ s.getName());
        System.out.println(s1.greet());
    }
}
