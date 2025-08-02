package JAVA_TEST.T1_Java_Programming_Assessment;

public class Q5_Operator_Precedence_Type_Casting {
    public static void main(String[] args) {
        //Write a program that demonstrates operator precedence and type casting in Java.

        int a = 10;
        double b = 3.5;

        // Operator Precedence: * has higher precedence than +
        // So, 10 + (int)(3.5 * 2) = 10 + 7 = 17
        int result = a + (int)(b * 2);
        System.out.println("Expression result: " + result);

        double result2 = a + b;     // Implicit casting
        System.out.println(result2);

        int result3 = a + (int)b;   //  // Explicit casting:
        System.out.println(result3);

    }
}
