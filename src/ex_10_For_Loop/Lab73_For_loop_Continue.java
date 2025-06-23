package ex_10_For_Loop;

public class Lab73_For_loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {;
            if (i ==5) {
                continue;  // to skip
            }
            System.out.println(i);
        }
    }
}
