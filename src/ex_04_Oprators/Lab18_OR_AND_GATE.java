package ex_04_Oprators;

public class Lab18_OR_AND_GATE {
    public static void main(String[] args) {
        // || - OR
        // only false && false returns true else true

        System.out.println(true || true); // True
        System.out.println(true || false); // True
        System.out.println(false || true);  // True
        System.out.println(false || false); // False

        //  And  &&
        // only true && true returns true else false

        System.out.println(true && true); // True
        System.out.println(true && false); // False
        System.out.println(false && true); // False
        System.out.println(false && false); // False
    }}

