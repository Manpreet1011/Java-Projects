public class Student extends Person{
    private int studentNum;
    double marks;
    public Student()
    {

    }
    public Student(String firstName,String lastname,int sinNum,int studentNum,double marks)
    {
        super(firstName,lastname,sinNum);
        this.studentNum=studentNum;
        this.marks=marks;
    }
    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    public void displayData()
    {
        super.displayData();
        System.out.println("Student Number is "+studentNum);
        System.out.println("Marks ia "+ marks);
    }
}
