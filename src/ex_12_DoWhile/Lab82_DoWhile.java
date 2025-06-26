package ex_12_DoWhile;

public class Lab82_DoWhile {
    public static void main(String[] args) {

        int a = 1;

        do {
            System.out.println("Body");
            System.out.println(a);
            a++;
        } while (a <10);  //  if(a>10) this false but still output is 1
    }
}
