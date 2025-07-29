package ex_24_Exceptions;

public class Lab_193_UnChecked {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = b/a;
        System.out.println(c);

        // UnChecked -> ArithmeticException, NullPointerException

        String name = null;
        name.trim();
        // java.lang.NullPointerException: Cannot invoke "String.trim()"

    }
}
