package ex_04_Oprators;

public class Lab14_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b); //If even then false else true

        boolean c= true || false; // If any single True then True else false

        System.out.println(c);

        boolean c1= false && true; // If both true then TRUE else False
        System.out.println(c1);

    }
}
