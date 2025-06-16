package Literals;

public class Lab06_literals_29 {
    public static void main(String[] args) {

        int age = 65;
        // Literal - Integral

        final float pi = 3.14f;
        //  Literal - float

        final int girl_age = 18;
        //girl_age = 19;

        boolean is_married = true;
        boolean is_married_amit = false;
        // Literal - boolean

        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        // char c = "A"; // "" == String = Bunch of Char

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PramodDutta");
        System.out.println("Pramod"+new_line+"Dutta");
        System.out.println("Pramod\nDutta");
        System.out.println("Pramod"+tab_line+"Dutta");
        System.out.println("Pramod"+back_space+"Dutta");
        System.out.println( " ----- ");

        System.out.println("Pramod is "+carriage_return+"Dutta");
        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");


    }
}
