 public class ClassName {
     public static void main(String[] args) {
         System.out.println("Hello");
         Circle1 c = new Circle1();
         System.out.println(c.circumference(3));
         System.out.println(c.area(3));
     }
 }
      class Circle1 {
        // double r;
         double circumference(double r)
         {
             return(2*3.14*r);
         }
         double area(double r)
         {
             return 3.14*r*r;
         }
     }

