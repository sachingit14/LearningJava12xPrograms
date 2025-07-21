package ex_20_OOPs_Super_Abstraction;

public class Lab_171_Abstract {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50K();

//      Father f1 = new Father();
//      you cant create instance of father because abstract class can not be initiated
    }
}


class Normal{
    // Concreate class / Complete class
}

abstract class Father {
    abstract void loan50K();
}

class Son extends Father{
    @Override
    void loan50K() {
        System.out.println("Loan Given...");
    }
}

