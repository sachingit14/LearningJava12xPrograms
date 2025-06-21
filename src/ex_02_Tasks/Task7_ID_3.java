package ex_02_Tasks;

public class Task7_ID_3 {
    public static void main(String[] args) {

        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;

        //m
        //i-- -> exp 1 -> i=0
        //-
        //j-- -> exp 2 -> j=1
        //-
        //k-- -> exp 3 -> k=2
      //  System.out.println(1-2-3);
        //m = -4

      System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
    }
}
