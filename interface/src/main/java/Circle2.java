public class Circle2 {
    private double x,y;
    private double radius;

    public Circle2(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    double circumference()
    {
        return 2*3.14*radius;
    }
    double area()
    {
        return 3.14*radius*radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }
}
