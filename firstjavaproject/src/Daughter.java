public class Daughter extends Father{
    public Daughter(String surName, String name, String address, int age) {
        super(surName, name, address, age);
    }

    public void whatToEat()
    {
        System.out.println("Daughter eats Sandwich");
    }
}
