package ex_14_Strings;

public class Lab92_String_Creation {
    public static void main(String[] args) {
        String s1 = "sachin"; // SCP -> string constant pool

        String s2 = new String("sachin"); // OA - Object area

        System.out.println(s1);
        System.out.println(s2);
    }
}
