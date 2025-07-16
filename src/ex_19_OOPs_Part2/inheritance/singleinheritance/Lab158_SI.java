package ex_19_OOPs_Part2.inheritance.singleinheritance;

public class Lab158_SI {
    public static void main(String[] args) {

        Son sachin = new Son();
        System.out.println(sachin.gold_f);
        sachin.bhk1();
        sachin.bhk2();

        Cousin c = new Cousin();
         c.rk1();
        // can not access
        // c.bhk1();
        // System.out.println(c.gold_f);

    }
}
