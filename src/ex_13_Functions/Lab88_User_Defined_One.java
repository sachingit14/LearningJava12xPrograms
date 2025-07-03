package ex_13_Functions;

public class Lab88_User_Defined_One {
    public static void main(String[] args) {
        int r1 = sum_of_no(4,10);
        System.out.println(r1);
        int r2 = sum_of_no(40,10);
        System.out.println(r2);
    }
     static int sum_of_no (int first, int second){
        return first + second;
     }
}
