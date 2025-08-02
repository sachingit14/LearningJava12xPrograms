package JAVA_TEST.T1_Java_Programming_Assessment;

import java.util.Scanner;

public class Q7_Find_Largest_of_3_no_if_else {
    public static void main(String[] args) {
//        Create a program to find the largest among three numbers using if-else statements.
//        - Read three integers from user input
//        - Use nested if-else or if-else if statements
//        - Handle cases where numbers might be equal

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any 3 no");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

      if (a==b && b==c){
          System.out.println("all no are equal");
        } else if (a>=b && a>=c){
            System.out.println(a+" is greater");
        } else if (c>=a && c<=b) {
            System.out.println(b+" is greater");
        }  else {
            System.out.println(c+" is greater");
        }
        scanner.close();
    }
}
