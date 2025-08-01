package ex_26_Collection_Framework.List;

import java.lang.classfile.constantpool.ConstantPool;
import java.util.*;

public class Lab_223_Arraylist_Collections {
    public static void main(String[] args) {
        List marks = new ArrayList<>();

        marks.add(85);
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);

        Collections.sort(marks); // for ascending order
        System.out.println(marks);

        Collections.sort(marks,Collections.reverseOrder()); // for descending order
        System.out.println(marks);

    }
}

