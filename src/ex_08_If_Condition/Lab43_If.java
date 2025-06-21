package ex_08_If_Condition;

public class Lab43_If {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        if (age >18){
            System.out.println("you can vote");
        } else {
            System.out.println("you can not vote");
        }
    }
}
