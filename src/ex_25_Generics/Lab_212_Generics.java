package ex_25_Generics;

public class Lab_212_Generics {
    public static void main(String[] args) {
        temp(3, 4);
        temp(3.34, 4.45);
        temp("SACHIN", "YADAV");
    }
    static <Sachin> Sachin temp(Sachin a, Sachin b){
        return null;
    }

    static <T> T temp1(T a, T b){
        return null;
    }

}
