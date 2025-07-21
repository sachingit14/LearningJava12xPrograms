package ex_21_Statics;

public class Lab_179_statics2 {
    public static void main(String[] args) {
        ATB umesh = new ATB(987654321,"Umesh");
        ATB anubha = new ATB(987654387,"Anumba");
        System.out.println(umesh.phone_no);
        System.out.println(anubha.name);
        System.out.println(ATB.course_name);
        System.out.println(ATB.course_name);
        ATB.MarkAttendance();
    }
}

class ATB {
    int phone_no;
    String name;
    static String course_name ="ABT_CLASS";

    public ATB (int phone_no,String name){
        this.phone_no = phone_no;
        this.name = name;
    }

    void display(){
        System.out.println(this.name + this.phone_no + course_name);
    }

    static void MarkAttendance(){
        System.out.println("Mark Attendance");
    }
}
