package ex_16_Arrays;

public class Lab140_Array_Reverse {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        for (int i = numbers.length-1;i>=0;i--){
            System.out.print(numbers[i]);
        }

//        int i = numbers.length - 1:
//                Start i from the last index of the array.
//                Since numbers.length = 6, this means i = 5.
//        i >= 0:
//                Keep running the loop until i reaches index 0.
//        i--:
//                Decrease the index by 1 in each iteration (reverse loop).


    }
}
