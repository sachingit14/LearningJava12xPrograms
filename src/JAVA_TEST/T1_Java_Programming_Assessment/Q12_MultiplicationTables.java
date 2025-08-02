package JAVA_TEST.T1_Java_Programming_Assessment;

public class Q12_MultiplicationTables {
    public static void main(String[] args) {
//        Write a program to print multiplication tables using nested loops.
//
//        - Print multiplication tables for numbers 1 to 5
//                - Each table should show multiplications from 1 to 10
//                - Use nested for loops
//                - Format output clearly
        System.out.println("------------------------------");
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Table of "+i+" : ");
            for (int j = 0; j <=10; j++) {
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println("------------------------------");

        }
    }
}
