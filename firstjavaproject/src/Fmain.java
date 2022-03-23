import java.util.ArrayList;
import java.util.List;

public class Fmain {
    public static void main(String[] args) {
        /*List<Father> list = new ArrayList<>();

        Father father = new Father("Khangura", "Manpreet", "Moga", 40);
        list.add(father);
        father = new Son("gill", "abc", "canada", 25, "swee");
        father.whatToEat();
        list.add(father);
        father = new Daughter("Khangura", "Sifit", "Cambridge", 1);
        System.out.println(father);
        father.whatToEat();
        list.add(father);
        father = new Son("Khangura", "Abhay", "Kot", 16, "National Convent");
        ((Son) father).display(); // type casting to son
        //System.out.println(father);
        list.add(father);
        //father.whatToEat();
        father.whatToEat();
        Son s = new Son("Khangura", "Abhay", "Kot", 16, "National Convent");
        s.whatToEat();
        System.out.println("List output");*/
        List<Father> list=createList();
        for (Father fa : list) {
            fa.whatToEat();
        }
    }
    public static List<Father> createList()
    {
        List<Father> list=new ArrayList<>();
        list .add(new Father("Khangura", "Manpreet", "Moga", 40));
        list.add(new Son("Khangura", "Abhay", "Kot", 16, "National Convent"));
        list.add(new Daughter("Khangura", "Sifit", "Cambridge", 1));
        return list;
    }
}
