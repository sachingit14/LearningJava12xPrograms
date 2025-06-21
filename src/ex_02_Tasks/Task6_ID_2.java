package ex_02_Tasks;

public class Task6_ID_2 {
    public static void main(String[] args) {

        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;

      //c=  //11+22
            //+
            //a++ -- 11 -- a=12
            //+
            //b++ -- 22 -- b=23
            //+
            //++a -- 13 -- a=13
            //+
            //++b -- 24 -- b=24
            //c=11+22+12+12+13+24=

       System.out.println(11+22+11+22+13+24);

        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);
    }
}
