package ex_16_Arrays;

public class Lab148_2D_Array_Iterate_For_Loop4 {
    public static void main(String[] args) {

        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        // 3x3
        // R ->  3  an d  C -> 3

        for (int i =0;i < matrix.length;i++){            // rows
            for (int j =0;j < matrix[i].length;j++){     // coloums
//                System.out.print (matrix[i][j]);
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
