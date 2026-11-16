package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println("Ford -> startEngine()");
        return "Ford's engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println("Ford -> accelerate()");
        return "Ford is accelerating";
    }

    @Override
    public String brake() {
        System.out.println("Ford -> brake()");
        return "Ford is braking";
    }
}
