package ex_16_Arrays;

public class Lab141_sum_of_arrays {
    public static void main(String[] args) {

        int [] numbres = {45,544,87,10,54};
        int sum = 0;
        for (int i = 0; i < numbres.length ; i++) {
            sum = sum+numbres[i];
        }
        System.out.println(sum);


        int [] num2 = {10,10,10,10,10,10};
        int sum2 = 0;
        for (int i = 0; i < num2.length; i++){
            sum2 = sum2 + num2[i];
        }
        System.out.print(sum2);


    }
}
