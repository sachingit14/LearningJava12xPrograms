package ex_19_OOPs_Part2.Poly.methodoverloading;

public class Lab162_MOloading {
    public static void main(String[] args) {

        MathOperations m1= new MathOperations();
        int r = m1.add(2,3);
        System.out.println(r);

        int r1 = m1.add(3,4,5);
        System.out.println(r1);

        double r0 = m1.add(3.34,4.56);
        System.out.println(r0);

    }
}
