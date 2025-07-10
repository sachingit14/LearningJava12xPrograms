package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab130_String_builder_and_buffer {
    public static void main(String[] args) {
        String s1 = "PRamod";
        s1 = s1+ "Dutta";
        System.out.println(s1); // here two sting is created in string constraint pool

        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);  // one

        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append(123);
        System.out.println(stringBuilder); // one

    }
}
