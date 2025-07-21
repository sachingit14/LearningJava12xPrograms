package ex_20_OOPs_Super_Abstraction;

import java.lang.classfile.Interfaces;

public class Lab_173_Interface_P1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.drive();
    }

}

class Car implements Brakes,Engine1{

    void drive(){
        stratEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak() {

    }

    @Override
    public void stratEngine() {
        System.out.println("Engine is starting");
    }

    @Override
    public void stopEngine() {

    }
}

interface  Brakes{
    void applyBreak();
}

interface Engine1{
    void stratEngine();
    void stopEngine();
    default void testEngine(){
        System.out.println("Concrete Complete");
    }
}