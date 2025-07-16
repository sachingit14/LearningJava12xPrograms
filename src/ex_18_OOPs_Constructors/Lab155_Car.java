package ex_18_OOPs_Constructors;

public class Lab155_Car {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.name = "Tesla model 3";
        tesla.year = 2025;

        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);

        Car nano = new Car();
        nano.name ="Tata Nano XE";
        nano.model = "Nano XMA624 cc";

        System.out.println(nano.name);
        System.out.println(nano.year);
        System.out.println(nano.model);

        Loginpage l = new Loginpage();

    }
}
