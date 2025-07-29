package ex_24_Exceptions;

public class Lab_197_Throwable {
    public static void main(String[] args) {
        int c =0;
        int b = 0;
        try {
            b = 10/c;
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);

    }
}
