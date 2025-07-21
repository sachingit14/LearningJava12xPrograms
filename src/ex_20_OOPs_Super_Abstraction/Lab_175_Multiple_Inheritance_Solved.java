package ex_20_OOPs_Super_Abstraction;

public class Lab_175_Multiple_Inheritance_Solved {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.money();
        child1.dc();

    }
}

class Child1 implements Father1,Mother {

    @Override
    public void money() {
        System.out.println("Money comes from child");
    }

    @Override
    public void m1() {

    }

    @Override
    public void f1() {

    }

    @Override
    public void dc() {
        Father1.super.dc();
        Mother.super.dc();
    }
}

interface  Father1 {
        void money();
        void f1();
        default void dc(){
            System.out.println("print f1");
        }
}

interface Mother {
        void money();
        void m1();
        default void dc(){
        System.out.println("print m1");
        }
}
