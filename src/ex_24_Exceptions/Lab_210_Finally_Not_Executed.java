package ex_24_Exceptions;

public class Lab_210_Finally_Not_Executed {
    public static void main(String[] args) {
        try {
            int a = 10/10;
            System.out.println(a);
//            System.exit(0); //- can only stop the execution of the finally block
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Hello Last");
        }
    }
}
