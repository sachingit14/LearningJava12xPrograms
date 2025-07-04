package ex_13_Functions;

import java.util.Scanner;

public class Lab91_Function_Arth {
    public static void main(String[] args) {

        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        // Logic Building
        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->

        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first no");
        int a = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Please enter the integer");
            System.exit(0);
        }
           System.out.println("Enter the second no");
        int b =0;
        if (scanner.hasNextInt()){
            b =  scanner.nextInt();
        } else {
            System.out.println("Please enter the integer");
            System.exit(0);
        }
        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);
        int result_mod = mod(a, b);

        System.out.println(a+" + "+b+" = " +result_sum);
        System.out.println("sub > "+result_sub);
        System.out.println("mul > "+result_mul);
        System.out.println("div > "+result_div);
        System.out.println("mod > "+result_mod);
    }
    static int sum (int a, int b){
        return (a+b);
    }
    static int sub (int a, int b){
        return (a-b);
    }
    static int div (int a, int b)throws ArithmeticException{
        if (b ==0){
            throw new ArithmeticException("Division by 0 is not allowd");
        }
        return (a / b);
    }
    static int mul (int a, int b){
        return (a * b);
    }

    static int mod (int a, int b){
        return (a % b);
    }

}

