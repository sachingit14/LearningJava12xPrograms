package ex_02_Tasks;

public class Task5_ID {
    public static void main(String[] args) {
        int i =11;
        i =i++ + ++i;

        System.out.println(i);

        //i++ expA-> 11 / i =12
        //+
        //++i expB-> 13 / i = 13
        // expA + expB = 24

    }
}
