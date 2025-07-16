package ex_17_OOPs;

public class Lab151_obj_info {
    public static void main(String[] args) {
        ATBx sachin = new ATBx();
        // Class - ATBx
        // Object Ref - sachin
        // Object -> new ATBx();

        sachin.name = "sachin yadav";
        sachin.doAssignment();

        ATBx pramod = new ATBx();
        pramod.name = "Pramod dutta";
        pramod.doAssignment();

        // we can create infinite class within the class

        class A{}
        class B{}
        class C{}
    //  ......
    }

}
