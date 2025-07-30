package ex_25_Generics;

public class Lab_211 {
    public static void main(String[] args) {
        temp_sum(23,45);
        temp_sum(2.3,4.5);
        temp_sum("Sachin","Yadav");

    }

    static Integer temp_sum(Integer a, Integer b){
        return null;
    }

    static Double temp_sum(Double a, Double b){
        return null;
    }

    static String temp_sum(String a, String b){
        return null;
    }

    // T -> sachin, rohit, akash...

    static <T>T temp_sum(T a, T b) {
        return null;
    }

    //or

    static <Sachin> Sachin temp_sum1(Sachin a, Sachin b) {
        return null;
    }
}
