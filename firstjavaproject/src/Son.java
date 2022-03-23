public class Son extends Father {
    String school;

    public Son(String surName, String name, String address, int age, String school) {
        super(surName, name, address, age);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Son{" +
                "surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }

    public void display() {
        System.out.println("Name is :" + name);
        System.out.println("Suname is : " + surName);
        System.out.println("Address is :" + address);
        System.out.println("Age is : " + age);
        System.out.println("School name is : " + school);
    }

    @Override
    public void whatToEat() {
        System.out.println("Son eats Burger");
    }
}
