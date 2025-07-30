package ex_26_Collection_Framework.List;

import java.util.Vector;

public class Lab_220_Vector {
    public static void main(String[] args) {
        Vector v = new Vector(); // similar like array

        v.add("sachin");
        v.add("yadav");
        v.add(true);
        v.add(1);
        v.remove(true);
        System.out.println(v);
    }
}

