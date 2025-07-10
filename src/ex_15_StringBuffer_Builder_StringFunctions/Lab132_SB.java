package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab132_SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.delete(5,16);
        System.out.println(sb);
        sb.replace(0,4,"C++");
        System.out.println(sb);
    }
}
