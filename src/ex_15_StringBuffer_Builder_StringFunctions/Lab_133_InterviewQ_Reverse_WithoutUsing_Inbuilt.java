package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_133_InterviewQ_Reverse_WithoutUsing_Inbuilt {
    public static void main(String[] args) {
        String input = "Sachin";

//        StringBuilder sb = new StringBuilder(input);
//        sb.reverse();
//        System.out.println(sb);

        for (int i= input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }
    }
}
