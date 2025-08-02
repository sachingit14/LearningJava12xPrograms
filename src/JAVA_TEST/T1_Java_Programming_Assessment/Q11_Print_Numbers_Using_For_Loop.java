package JAVA_TEST.T1_Java_Programming_Assessment;

import java.util.Scanner;

public class Q11_Print_Numbers_Using_For_Loop {
    public static void main(String[] args) {
//        Write a program to print numbers from 1 to N using a for loop.
//        - Read the value of N from user input
//        - Use for loop to print numbers from 1 to N
//        - Print numbers in a single line separated by spaces

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no");

        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
