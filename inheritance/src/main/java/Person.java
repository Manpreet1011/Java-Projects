public class Person {
    private String firstName;
    private String lastName;
    private int sinNumber;
    public Person()
    {

    }
    public Person(String firstName,String lastName,int sinNumber)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.sinNumber=sinNumber;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSinNumber() {
        return sinNumber;
    }

    public void setSinNumber(int sinNumber) {
        this.sinNumber = sinNumber;
    }
    public void displayData()
    {
        System.out.println("First Name is "+ getFirstName());
        System.out.println("Last Name is "+ getLastName());
        System.out.println("Sin Number is "+ getSinNumber());
    }
}
