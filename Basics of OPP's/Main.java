class Car {
    String brand;
    int speed;
    void displayInfo() {
        System.out.println("\nBrand of my car is " + brand);
        System.out.println("The speed is : " + speed + "\n");
    }
}
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.speed = 200;
        car1.displayInfo();  

        Car car2 = new Car();
        car2.brand = "Lamborghini";
        car2.speed = 400;
        car2.displayInfo();
    }
}
