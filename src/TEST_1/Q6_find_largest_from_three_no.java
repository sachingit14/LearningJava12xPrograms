package TEST_1;

import java.util.Scanner;

public class Q6_find_largest_from_three_no {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first no");
        int a = scanner.nextInt();

        System.out.println("Enter 2nd no");
        int b = scanner.nextInt();

        System.out.println("Enter 3rd no");
        int c = scanner.nextInt();

        int largest = a;

        if (b> largest){
          largest = b;
        }
        if (c>b){
           largest = c;
        }

        System.out.println("The largest no is "+ largest);


    }
}
