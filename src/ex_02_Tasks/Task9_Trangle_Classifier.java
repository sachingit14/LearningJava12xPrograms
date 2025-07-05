package ex_02_Tasks;

public class Task9_Trangle_Classifier {
    public static void main(String[] args) {
        int side1 = 5;
        int side2 = 6;
        int side3 = 6;
        if (side1 == side2 && side2 == side3) {
            System.out.println("EQ");
        } else if (side1 == side2 || side2 == side3 || side1 ==side3) {
            System.out.println("ISO");
        } else {
            System.out.println("scalene");
        }
    }
}
