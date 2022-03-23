public class Father {
    String surName;
    String name;
    String address;
    int age;

    public Father(String surName, String name, String address, int age) {
        this.surName = surName;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void whatToEat() {
        System.out.println("Fatehr eats Pizza");
    }

    @Override
    public String toString() {
        return "Father{" +
                "surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
    // public void display(){}
}
