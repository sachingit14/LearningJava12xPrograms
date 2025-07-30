package TEST_1;

public class Q4_TypeCasting_demo {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid syntax -> smaller data into the bigger data type
        // Implicit - Casting - Widening

        byte b1 = 10;
        int a1 = b1; // Valid Syntax -> Widening - Implicit Casting - Automatically done.
        int a2 = (int)b1; // Widening Explicit Casting (int) - optional
        System.out.println(a2);
    }
}
