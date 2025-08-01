package ex_26_Collection_Framework.MAP;

import java.util.*;

public class Lab236_Map_Real {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap();

        student1.put("name","sachin");
        student1.put("phone","976543210");
        student1.put("address","BLR");
        student1.put("home_address","BTM");
        System.out.println(student1);

        Map<String,Object> student2 = new LinkedHashMap<>();
        student2.put("name","rohit");
        student2.put("phone","976543210");
        student2.put("address","Mum");
        student2.put("home_address","Thane");
        System.out.println(student2);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");
    }
}
