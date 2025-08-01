package ex_26_Collection_Framework.List;

import java.util.Stack;

public class Lab_228_Stack {
    public static void main(String[] args) {
        // Stack
        //  List In and First Out (LIFO)

        Stack s = new Stack();
        s.add("Sachin");
        s.add("Yadav");
        s.add("QA");

        // add == push // duplicate allowed
        s.push("QA");
        System.out.println(s);

        System.out.println(s.size());

        System.out.println(s.peek()); //shows the last item
        System.out.println(s);

        System.out.println(s.pop()); // pick the last item and remove from array
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Snehal"));
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(1));
    }
}
