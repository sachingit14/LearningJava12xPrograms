package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_229_ArrayList_Class_element {
    public static void main(String[] args) {

        Student s1 = new Student("Sachin","01");
        Student s2 = new Student("Rohit","02");
        Student s3 = new Student("Akash","02");

        List<Student> all_student = new ArrayList<>();
        all_student.add(s1);
        all_student.add(s2);
        all_student.add(s3);

        System.out.println(all_student);

        s1.printelement();
        s2.printelement();
        s3.printelement();

    }
}
