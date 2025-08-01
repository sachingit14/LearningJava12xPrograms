package ex_26_Collection_Framework.List;

import java.util.*;

public class Lab_227_AL_iteration {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Sachin");
        mylist.add("Yadav");
        mylist.add("QA");

        System.out.println(" - To Print Arraylist - 1 ");

        for (String s:mylist){
            System.out.println(s);
        }

        System.out.println(" - To Print Arraylist - 2 ");

        // Iterator
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" - To Print Arraylist - 3 ");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
    }
}
