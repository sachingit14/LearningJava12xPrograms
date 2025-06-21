package ex_07_Increment_Decrement_Op;

public class Lab34_In_de_op_2 {
    public static void main(String[] args) {
        //Take Inputs
        String age_string = args[0];
        String a1 = args[1];
//        String a2 = args[2];
//        String a3 = args[3];

        // convert from string to int and float

        int age = Integer.parseInt(age_string);
        Float a = Float.parseFloat(a1);

        System.out.println("int -> "+age_string);
        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);

    }
}
