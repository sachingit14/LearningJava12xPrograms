package ex_14_Strings;

public class Lab94_Strings_Functions {
    public static void main(String[] args) {

        char c = 'A';
        System.out.println(c);

        String s1 = "ABCD";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("E"));

        // how many present SCP =
//        From code:
//        "ABCD" → SCP
//        "E" → SCP
//        "abcd" → heap
//        "ABCDE" → heap
    }
}
