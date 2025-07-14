package ex_16_Arrays;

import java.util.Scanner;

public class Lab150_2D_Left_Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the No");
        int n = scanner.nextInt();

        for (int i = n; i >=1; i--){
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
