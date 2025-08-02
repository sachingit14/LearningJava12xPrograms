package JAVA_TEST.T1_Java_Programming_Assessment;

import java.util.Scanner;

public class Q13_Star_Pattern_Printing {
    public static void main(String[] args) {
//        Create a program to print various star patterns using nested loops.
//        - Print a right triangle pattern of stars
//        - Print a pyramid pattern of stars
//                - Use nested loops for pattern generation
//        - Make patterns scalable based on input size

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no");

        int n = scanner.nextInt();

        for (int i=0;i<n;i++){
            for (int j =0; j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        scanner.close();
    }

}
