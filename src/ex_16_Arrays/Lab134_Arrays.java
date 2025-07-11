package ex_16_Arrays;

import java.util.Arrays;

public class Lab134_Arrays {
    public static void main(String[] args) {

            int a = 10;
            int[] marks = {90,80,70,50,40,60};
            boolean [] is_married = {true, false, true, false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        // System.out.println(marks[-1]); // ArrayIndexOutOfBoundsException
        // System.out.println(marks[10]); // ArrayIndexOutOfBoundsException

        char c = 'A';
        String name = "sachin";
        String[] split_name = name.split("");
        // ["s","a","c","h","i","n"]

        }
}
