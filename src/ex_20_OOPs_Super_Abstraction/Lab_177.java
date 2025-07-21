package ex_20_OOPs_Super_Abstraction;

public class Lab_177 {
    public static void main(String[] args) {
        sachin s = new yadav();
        yadav y = new yadav();
        s.display();
        System.out.println(s.a);

    }
}

class yadav implements sachin {

    @Override
    public void display() {
        System.out.println(a);
    }
}

interface sachin {
    int a =10;
    void display();
}
