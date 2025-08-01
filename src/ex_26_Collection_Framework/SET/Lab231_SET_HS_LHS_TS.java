package ex_26_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab231_SET_HS_LHS_TS {
    public static void main(String[] args) {

        Set<String> hs = new HashSet();
        // Hashing mechanism to store the element,no order.
        // no duplicates

        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
//        hs.add(123);
        hs.add(null); // can store one null
        System.out.println(hs);

        System.out.println(" ---------------------------");

        Set<String> lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain as user entered, no duplicates

        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        System.out.println(" ---------------------------");

        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.

        // means store in Ascending order

        //no duplicate, no null ,

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("WaterMelon");
        //ts.add(123); // java.lang.ClassCastException
        //ts.add(null); // java.lang.NullPointerException
        System.out.println(ts);

    }
}
