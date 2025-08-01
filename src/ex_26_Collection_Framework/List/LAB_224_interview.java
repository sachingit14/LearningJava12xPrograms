package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LAB_224_interview {
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList();

        // 1,2,3,4  -> 24,18,12,6

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(a);

        Collections.sort(a,Collections.reverseOrder());

        for (Integer o: a){
            System.out.println(6*o);
        }
    }
}
