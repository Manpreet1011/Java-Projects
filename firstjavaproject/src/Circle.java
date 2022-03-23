public class Circle {
    public static void main(String[] args) {
        CircleC c1 = new CircleC();
        c1.r = 4;
        System.out.println(c1.circumfrence());
        System.out.println(c1.area());

    }
}
     class CircleC
    {
        double r;
       double circumfrence()
        {
            return (2*3.14*r);
        }
        double area()
        {
            return 3.14*r*r;
        }

    }
