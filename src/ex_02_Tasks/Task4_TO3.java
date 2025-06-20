package ex_02_Tasks;

public class Task4_TO3 {
    public static void main(String[] args) {
        int age = 10;
     //   String result = (age < 18?"adult":"minor")> 65 ?"senior":"adult";---error

        String result = age > 65 ? "Senior" : (age > 18 ? "adult" : "minor");


        System.out.println(result);
    }
}
