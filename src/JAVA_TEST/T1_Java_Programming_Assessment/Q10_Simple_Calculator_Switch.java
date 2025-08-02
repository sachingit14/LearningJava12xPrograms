package JAVA_TEST.T1_Java_Programming_Assessment;

import java.util.Scanner;

public class Q10_Simple_Calculator_Switch {
    public static void main(String[] args) {
//        Write a program to create a simple calculator using switch statement.
//        - Read two numbers and an operator (+, -, *, /)
//        - Use switch statement to perform the operation
//                - Handle division by zero
//                - Display the result

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first no");

        double num1 = scanner.nextDouble();

        System.out.println("Enter a second no");

        double num2 = scanner.nextDouble();

        System.out.println("enter a operator eg: operator (+, -, *, /)");

        char op = scanner.next().charAt(0);

        double result;

        switch (op){
            case '+' : result = num1+ num2 ;
                System.out.println(result); break;
            case '-' : result = num1 - num2;
                System.out.println(result); break;
            case '*' : result = num1 * num2;
                System.out.println(result); break;
            case '/':
                if (num2 ==0){
                    System.out.println("divided by zero not allow");
                } else {
                result = num1 / num2;
                System.out.println(result);} break;
            default:
                System.out.println("invalid operator please enter (+, -, *, /)");
        }
        scanner.close();
    }
}
