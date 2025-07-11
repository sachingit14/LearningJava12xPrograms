package ex_16_Arrays;

public class Lab138_Arrays_Max_Min {
    public static void main(String[] args) {
        int [] array ={10,50,46,75,85,42,96,75,12,85,3,6};
        int max = array[0];

        for (int i =0; i < array.length;i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Max no is = "+max);

        int min = array[0];

        for (int i = 0; i <array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println( "Min no is = "+min);
    }
}
