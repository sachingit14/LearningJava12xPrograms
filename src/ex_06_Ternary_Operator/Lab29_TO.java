package ex_06_Ternary_Operator;

public class Lab29_TO {
    public static void main(String[] args) {
        //  ? :
        // result = condition ? expression1 : expression2;
        int age = 27;
        String canIGoTOGoa =  age > 18 ? "Yes You can" : "You can't";
        System.out.println(canIGoTOGoa);


        int number = 5;
        String result = number > 0 ? "positive" : "negative";
//        int result = number > 0 ? "positive" : "negative"; --wrong because diff data type
        System.out.println(result);
    }
}
