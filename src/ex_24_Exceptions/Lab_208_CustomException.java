package ex_24_Exceptions;

public class Lab_208_CustomException {
    public static void main(String[] args) {
        Bank sbi = new Bank(100,"INR");
        Bank icici = new Bank(120,"INR");
        Integer total_bal = sbi.add(icici);
        System.out.println(total_bal);
        Bank jp_chase = new Bank(150,"USD");
        Integer total_bal_of_all_country = sbi.add(jp_chase);
        System.out.println(total_bal_of_all_country);
    }
}
