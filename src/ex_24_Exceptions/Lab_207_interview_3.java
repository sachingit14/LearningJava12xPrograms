package ex_24_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_207_interview_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C://a.log");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("yes");
        }
    }
}
