import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> list =new java.util.ArrayList<>();

        // Addition of elements to list
        list.add("Red");
        list.add("Blue");
        list.add("Black");
        list.add("Green");

        // Iteration of list
        System.out.println("Initial Iteration");
        for( String s :list)
        {
            System.out.println(s);
        }

        //Insertion at first position
        list.add(0,"Parrot");
        System.out.println("Iteration after adding  element at the start");
        for(String s: list)
        {
            System.out.println(s);
        }

        // Retrieve an element from at specific index
        System.out.println("Element at Loc 3 : "+ list.get(3));

        int i= list.indexOf("Green");
        list.set(i,"Yellow");
        System.out.println("Iteration after updating element by name");
        for(String s: list)
        {
            System.out.println(s);
        }
        list.remove(1);
        //list.remove("Red");
        System.out.println("After removing element");
        for(String s : list)
        {
            System.out.println(s);
        }
    }
}
