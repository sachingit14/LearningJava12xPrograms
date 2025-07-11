package ex_16_Arrays;

import java.util.Arrays;

public class Lab142_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int [] num ={10,654,46,4,64,6,41,122,4};
        Arrays.sort(num);
        System.out.println(num[num.length-2]);
    }
}
