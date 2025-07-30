package TEST_1;

public class Q2_String_Concatenation_Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // 1) Normal number addition
        System.out.println(a + b);

        // 2) String + number → becomes string concatenation
        System.out.println("Result: " + a + b);    // "Result: 1020" (joins as text)

        // 3) Force addition first with parentheses
        System.out.println("Result: " + (a + b));  // "Result: 30"

        // 4) Number + number + String → left side adds first
        System.out.println(a + b + " is the sum"); // "30 is the sum"

    }
}
