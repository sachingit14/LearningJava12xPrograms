package ex_20_OOPs_Super_Abstraction;

import ex_18_OOPs_Constructors.Car;

public class Lab_168 {
    public static void main(String[] args) {
        car nano = new car(100);
        nano.display();

    }
}

class Vehicle {
    public int maxspeed = 180;

    void notest (){
        System.out.println("Empty");
    }

    Vehicle(){
        System.out.println("Default Constructor");
    }

    Vehicle(int a){
        System.out.println("Parameterise Constructor");
    }

    Vehicle (int a,int b){
        System.out.println("Parameterise Constructor two");
    }
    // Method Overloading - Same, same name function with different arguments.
    void msg (){
        System.out.println("no reply");
    }
    void msg (int a){
        System.out.println("no reply of a");
    }

    void display (){
        System.out.println("Vehicle Parent");
    }




}

class car extends Vehicle{
    private int maxSpeed =200;

    car(){
        super(100);
    }

    void test(){}

    car(int a){
        System.out.println("PC car");
    }
    @Override
    void display(){
        System.out.println("Override of car");
        System.out.println(super.maxspeed);
        System.out.println(this.maxSpeed);
        super.notest();
        this.test();
    }

};
