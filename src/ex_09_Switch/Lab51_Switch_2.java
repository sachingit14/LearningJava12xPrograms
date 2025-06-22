package ex_09_Switch;

import java.util.Scanner;

public class Lab51_Switch_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter value");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("mon"); break;
            case 2 :
                System.out.println("Tue"); break;
        }

    }
}
