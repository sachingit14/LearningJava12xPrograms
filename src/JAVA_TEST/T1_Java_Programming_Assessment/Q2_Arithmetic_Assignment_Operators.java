package JAVA_TEST.T1_Java_Programming_Assessment;

public class Q2_Arithmetic_Assignment_Operators {
    public static void main(String[] args) {

    //Create a Java program that demonstrates various arithmetic and assignment operators.
      int a = 10;
      int b = 5;
        //arithmetic operators
        System.out.println(a+" + "+b+" = "+(a+b)); //Addition
        System.out.println(a-b); //Subtraction
        System.out.println(a*b);   //Multiplication
        System.out.println(a/b);  //Division
        System.out.println(a%b); //Modulus

        // assignment operators
        a += 10;
        System.out.println(a);
        b -=2;
        System.out.println(b);
   }
}

