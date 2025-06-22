package ex_09_Switch;

import java.util.Scanner;

public class Lab49_Switch_hasNextInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value between 1 to 7");

        if (scanner.hasNextInt()) {
            int day =scanner.nextInt();

            switch (day){
                case 1 :
                    System.out.println("Mon"); break;
                case 2:
                    System.out.println("Tue"); break;
                case 3:
                    System.out.println("Wed"); break;
                case 4:
                    System.out.println("Thur"); break;
                case 5:
                    System.out.println("Fri"); break;
                case 6:
                    System.out.println("Sat"); break;
                case 7:
                    System.out.println("Sun"); break;
                default:
                    System.out.println("Enter the number from 1 to 7 only");
            }

        }

        else {
            System.out.println("please enter only int");
        }
    }
}
