// Write a Java program to create a class called Vehicle with a method called drive(). 
// Create a subclass called Car that overrides the drive() method to print "Repairing a car".

package classes;

// Vehicle.java
// Parent class Vehicle
class Vehicle {
    public void drive() {
        System.out.println("Repairing a vehicle");
    }
}

Copy
// Car.java
// Child class Car
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}
Copy
// Main.java
// Main class
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive(); // Output: Repairing a vehicle
        car.drive(); // Output: Repairing a car
    }
}
