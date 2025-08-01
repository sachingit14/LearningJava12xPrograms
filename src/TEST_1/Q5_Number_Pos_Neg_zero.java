package TEST_1;

import java.util.Scanner;

public class Q5_Number_Pos_Neg_zero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();

            if (i > 0) {
                System.out.println("Its a positive number");
            } else if (i < 0) {
                System.out.println("Its a negative number");
            } else {
                System.out.println("Its a ZERO");
            }
        } else {
            System.out.println("Enter Integer only");
        }
    }
}
