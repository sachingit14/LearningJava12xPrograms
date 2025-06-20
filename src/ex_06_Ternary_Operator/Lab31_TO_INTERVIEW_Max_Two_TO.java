package ex_06_Ternary_Operator;

public class Lab31_TO_INTERVIEW_Max_Two_TO {
    public static void main(String[] args) {
        // Find the maximum number between two numbers.
        int x = 10;
        int y = 20;
        System.out.println(Math.min(x,y));

        int max = x > y ? x : y;  //TO
        System.out.println(max);

        int b = 100;
        int c = 200;

        int max1 = b > c? b:c;
        System.out.println(max1);


    }
}
