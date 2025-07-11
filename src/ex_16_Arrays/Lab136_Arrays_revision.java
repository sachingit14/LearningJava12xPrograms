package ex_16_Arrays;

public class Lab136_Arrays_revision {
    public static void main(String[] args) {
        String [] names ={"Sachin","Shiv","Kumar"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);

        String [] store_values = new String[3];
        store_values[0] ="Bhim";
        store_values[1] ="Arjun";
        store_values[2] ="Pandu";

        System.out.println(store_values.length);
        System.out.println(store_values[0]);

        boolean [] is_male_data = new boolean[2];
        is_male_data[0] = true;
        is_male_data[1] = false;
    }
}
