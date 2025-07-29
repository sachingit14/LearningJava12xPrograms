package ex_24_Exceptions;

public class Lab_201_Multiple_OR {
    public static void main(String[] args) {
        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a; // ArithmeticException
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be always called");
        }

    }
}
