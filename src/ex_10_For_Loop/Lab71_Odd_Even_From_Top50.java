package ex_10_For_Loop;

public class Lab71_Odd_Even_From_Top50 {
    public static void main(String[] args) {

        // TO find the even numbers from 1 to 50
        // even -> i%2 ==0

        for (int i = 0; i <= 50; i++) {
            if(i%2==0){                    // for first odd if(i%2!=0){
                System.out.println("Even  -> "+i);
            }else {
                System.out.println("odd   -> "+i);
            }
        }
    }
}
