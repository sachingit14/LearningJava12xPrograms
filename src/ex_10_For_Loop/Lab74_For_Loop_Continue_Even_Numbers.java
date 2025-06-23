package ex_10_For_Loop;

public class Lab74_For_Loop_Continue_Even_Numbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                continue; // it will skip the even
            }
            System.out.println("Odd -> " + i);

        }
    }
}
