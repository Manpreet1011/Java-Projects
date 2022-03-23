interface B
{
    int methodB(int i);
}

class A implements B
{
    public int methodB(int i)
    {
        i=i*i;
        return i;
    }
}


public class MainClass
{
    public static void main(String[] args)
    {
        B b = new A();
        System.out.println(b.methodB(2));
    }
}


