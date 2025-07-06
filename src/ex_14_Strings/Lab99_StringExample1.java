package ex_14_Strings;

public class Lab99_StringExample1 {
    public static void main(String[] args) {
        String s = "java";
        char c = s.charAt(2);
        // Index = strats from 0,1....
        System.out.println(c);

        System.out.println(s.codePointAt(1));

        // CompareToIgnore(Sting sr)    // it gives output in int if true then 0 else diff unicode
        int result = "abc".compareTo("ABC");
        int result2 = "abc".compareToIgnoreCase("ABC");
        System.out.println(result); // false
        System.out.println(result2); // true - 0

        int ind = s.indexOf("a");
        System.out.println(ind); //1

        int indl = s.lastIndexOf("a") ;
        System.out.println("lastIndexOf a ->"+indl);

        boolean b = "".isEmpty();
        System.out.println(b);  // true

        String s12 = s.replace('a','o');
        System.out.println(s12);

        String s13 = String.join("--","java","python");
        System.out.println(s13);

        boolean s14 = s.startsWith("ja");
        System.out.println(s14);

    }
}
