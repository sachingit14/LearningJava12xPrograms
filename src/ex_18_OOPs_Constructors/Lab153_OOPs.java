package ex_18_OOPs_Constructors;

public class Lab153_OOPs {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        new Baby();
        Baby b2;  // this is not object this is reference
            }
    }

    class Baby{
        String name;

        // Default Constructor also called
        Baby() {
            System.out.println("I am called, Object is created!");
    }
}
