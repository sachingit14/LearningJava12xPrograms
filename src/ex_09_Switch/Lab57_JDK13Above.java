package ex_09_Switch;

public class Lab57_JDK13Above {
    public static void main(String[] args) {

        //new feature in JDK >13 (You can write -> instead of break
        int a =20;
        switch (a){
            case 10 -> System.out.println("10");
            case 20 -> System.out.println("20");
            case 30 -> System.out.println("30");
        }
    }
}
