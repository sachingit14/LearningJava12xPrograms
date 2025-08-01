package ex_26_Collection_Framework.SET;

import java.util.*;

public class Lab232 {
    public static void main(String[] args) {

        Set<Integer> st = new TreeSet<>();
        st.add(8);
        st.add(5);
        st.add(6);
        System.out.println(st);

        Iterator iterator = st.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
