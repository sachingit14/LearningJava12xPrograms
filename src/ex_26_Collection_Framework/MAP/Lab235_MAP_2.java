package ex_26_Collection_Framework.MAP;

import java.util.*;

public class Lab235_MAP_2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        //HashMap map = new HashMap();
        map.put("id",1);
        map.put("id",2); // consider this latest one cause of duplicate key value
        map.put("id5",2);   // duplicate value allow
        map.put("id2",100);
        map.put("id4",null);
        map.put(null,102); // One null can allow
        map.put(null,104);  // latest
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));

        System.out.println(map.keySet());  // print all unique keys
        System.out.println(map.values());  // print all values

        System.out.println(map.get("id2"));
    }
}
