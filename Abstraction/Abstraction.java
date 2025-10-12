public class Abstraction {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
        car1.stop();

        Bike bike1 = new Bike();
        bike1.start();
        bike1.stop();
    }
}

abstract class Vehicle {
    abstract void start(); // abstract method

    void stop() { // concrete method
        System.out.println("Vehicle is Stopping");
    }
}

class Car extends Vehicle { // here implementation of start method is compulsory as it extends form vehicle
    void start() {
        System.out.println("Car starts with a key/button");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with Kick");
    }
}
