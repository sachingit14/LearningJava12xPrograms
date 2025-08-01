package ex_26_Collection_Framework.MAP;

import java.util.*;

public class Lab234_MAP {
    public static void main(String[] args) {
        //        Map m1 = new Map();

        // You can also add keys as any other data type.
        //        m1.put("name","pramod");
        //        m1.put("rollno","pramod");
        //        m1.put(true,"pramod");
        //        m1.put(3.14,"pramod");


        Map<String,Object> m1 = new HashMap();  // like aadhar no // fastest // ,mostly used

        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210

        //  PUT - put the key with the value into the map
        m1.put("name", "pramod");
        m1.put("rollno", 1);
        m1.put("phone", 987654321);
        System.out.println(m1);  // order is not maintained



        Map m2 = new LinkedHashMap();  // like flat
        m2.put("name","pramod");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);  // order will maintain


        Map m3 = new TreeMap();   // like block
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m3.put("name","pramod");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);   // it will sort based on first char //ascending


    }
}
