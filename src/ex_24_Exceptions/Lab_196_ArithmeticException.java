package ex_24_Exceptions;

public class Lab_196_ArithmeticException {
    public static void main(String[] args) {
        int c =0;
        int b = 0;
        try {
            b = 10/c;
        } catch (ArithmeticException e) {           //prefer
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(c);

    }
}
