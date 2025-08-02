package JAVA_TEST.T1_Java_Programming_Assessment;

import java.util.Scanner;

public class Q9_Day_of_the_Week_switch {
    public static void main(String[] args) {

//        Day of the Week (Switch Statement)
//        Create a program using switch statement to display the day of the week.
//        - Read a number (1-7) representing day of week
//        - Use switch statement to print corresponding day name
//        - Handle invalid input with default case

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter no from 1-7 to find out week day");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Sun");
                    break;
                case 2:
                    System.out.println("Mon");
                    break;
                case 3:
                    System.out.println("Tue");
                    break;
                case 4:
                    System.out.println("Wed");
                    break;
                case 5:
                    System.out.println("Thur");
                    break;
                case 6:
                    System.out.println("Fri");
                    break;
                case 7:
                    System.out.println("Sat");
                    break;
                default:
                    System.out.println("Enter valid no");
            }
        } else {
            System.out.println("Enter Int only");
        }
    }
}
