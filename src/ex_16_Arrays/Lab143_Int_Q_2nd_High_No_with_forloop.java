package ex_16_Arrays;

public class Lab143_Int_Q_2nd_High_No_with_forloop {
    public static void main(String[] args) {
        int[] numbers ={12,45,5,6,89,489,66};
        int highest = 0;
        int sencondhighest = 0;

        for (int num : numbers) {
            if (num > highest){
                sencondhighest = highest;
                highest = num;
            } else if (num > sencondhighest && num != highest) {
                sencondhighest = num;
            }
        }

        System.out.println(sencondhighest);

    }
}
