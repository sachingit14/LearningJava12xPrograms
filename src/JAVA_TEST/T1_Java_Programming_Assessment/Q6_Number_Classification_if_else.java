package JAVA_TEST.T1_Java_Programming_Assessment;

import java.util.Scanner;

public class Q6_Number_Classification_if_else {
    public static void main(String[] args) {

//          Write a program to check if a number is positive, negative, or zero.
//        - Read an integer from user input
//        - Use if-else statements to classify the number
//        - Print appropriate message for each case

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");


        if(scanner.hasNextInt()){

            int i = scanner.nextInt();

            if (i == 0) {
                System.out.println("Its a zero");
            } else if (i > 0) {
                System.out.println("Its a positive no");
            } else {
                System.out.println("Its a negative no");
            }
        }
        else {
            System.out.println("enter int only");
        }

    }
}
