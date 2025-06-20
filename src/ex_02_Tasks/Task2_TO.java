package ex_02_Tasks;

import java.sql.SQLOutput;

public class Task2_TO {
    public static void main(String[] args) {

        // Step 1 ->  Input, Output - data type
        int a = 0;
        // input -> int
        // output -> String -> even or odd

        // Step 2 ->
        // num%2 == 0 >  even else 1 odd.

        String result = (a % 2== 0)? "EVEN": "ODD";
        System.out.println(result);

        // Edge Cases
        //  -negative, float.,0
    }
}
