package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_222_Nested_ArrayList {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        //fruits1.add(133);
        System.out.println(fruits1);

        List<String> fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);

        List<String> vegatables = new ArrayList<>();
        vegatables.add("tamato");
        vegatables.add("patato");
        vegatables.add("onion");
        System.out.println(vegatables);

        List all_items = new ArrayList();
        all_items.add(fruits1);
        all_items.add(fruits2);
        all_items.add(vegatables);
        System.out.println(all_items);

        System.out.println(all_items.size());
        System.out.println(all_items.get(1));

    }
}
