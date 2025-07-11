package ex_16_Arrays;

public class Lab135_Arrays_way {
    public static void main(String[] args) {
        int[] marks = {80, 70, 90, 75, 76, 80};

        // 2nd way to create the array
        int[] marks2 = new int[5];
//        marks2[0] = 45;

        int marks3[] = new int[5]; //fixed size

        String[] names = new String[3];
        names[0] = "Sachin";
        names[1] = "shiv";
        names[2] = "kumar";

        System.out.println(names[1]); // default value is null for string
        System.out.println(marks2[0]); // default value is 0 for int

      }
    }
