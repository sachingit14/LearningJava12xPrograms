package JAVA_TEST.T1_Java_Programming_Assessment;

public class Q4_Increment_Decrement_Operators {
    public static void main(String[] args) {
        //Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.

        int i = 5;

        System.out.println(++i);  // first increase then print =6
        // i= 6
        System.out.println(i++);  // first print then increase =6
        // i= 7
        System.out.println(--i);  // first decrease then print =6
        // i= 6
        System.out.println(i--);  // first print then decrease = 6
        // i = 5
        System.out.println(i);
    }
}
