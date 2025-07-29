package ex_24_Exceptions;

public class Lab_192_Exceptions {
    public static void main(String[] args) {
        String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // java.lang.NumberFormatException
        int b = 100/a; // java.lang.ArithmeticException: / by zero

        System.out.println(b);
        System.out.println("End the program");
    }
}
