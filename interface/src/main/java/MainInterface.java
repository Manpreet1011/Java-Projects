import java.util.ArrayList;
import java.util.List;

public class MainInterface {
    public static void main(String[] args) {
        Circle c= new Circle();
        Rectangle r=new Rectangle();
        ShapeInterface c1=new Circle();
        List<ShapeInterface> list =new ArrayList<>();
        list.add(c);
        list.add(r);
        list.add(c1);
        ShapeInterface shape = ()-> {
            System.out.println("Lambda");
        };
        shape.area();
        list .add(shape);
       // System.out.println();
        System.out.println("size of list is "+list.size());
        for(ShapeInterface l:list)
        {
            l.area();
        }
        c.display();
        c.area();
        r.area();
        r.Display();
    }
}
