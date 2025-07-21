package ex_20_OOPs_Super_Abstraction;

public class Lab_172_AC {
    public static void main(String[] args) {
    Wagonr car = new Wagonr();
    car.drive();
    }
}





class Wagonr extends Engine implements Tyre,Gear {
    void drive(){
        RubberTyre();
        BlackColorTyre();
        StartEngine();
        ChangeGear();
        StopEngine();
    }

    @Override
    void StartEngine() {
        System.out.println("Starting the wagonr");
    }

    @Override
    public void RubberTyre() {
        System.out.println("Rubber tyre checked");
    }

    @Override
    public void BlackColorTyre() {
        System.out.println("Black color checked");
    }

    @Override
    public void M1() {
        Tyre.super.M1();
    }

    @Override
    public void ChangeGear() {
        System.out.println("Gear Changed");
    }
}

abstract class Engine {
    abstract void StartEngine();

    void StopEngine(){
        System.out.println("Stop!");
    }
}

interface Tyre{
    void RubberTyre();
    void BlackColorTyre();

    // interface does not have any complete function it only contains incomplete function
    // But you can use complete function by using the "default" keyword
    // JDK >11 This feature
    default void M1(){
    }
    static void M2(){
    }
}

interface Gear {
    void ChangeGear();
        }