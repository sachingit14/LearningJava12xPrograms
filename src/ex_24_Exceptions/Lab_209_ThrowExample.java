package ex_24_Exceptions;

public class Lab_209_ThrowExample {
    public static void main(String[] args) {
        valid_age_for_club(15);
    }

    static void valid_age_for_club(int age){
        if (age < 18){
            try {
                throw new Exception ("Minor not allowed");
            } catch (Exception e) {
                System.out.println(e.getMessage()); // normal msg
 //               e.printStackTrace();  // for red error
            }
        } else {
            System.out.println("Enjoy clubbing");
        }
    }
}
