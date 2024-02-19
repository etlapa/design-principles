package mx.edev.design_principles.composing_objects.case2.composition;

public class Main {
  public static void main(String[] args) {
    System.out.println("********** Car (downcasting) **********");
    Vehicle vehicle = new Car();
    vehicle.start();
    ((Car) vehicle).drive(); // Downcasting to access specific methods
    vehicle.stop();

    System.out.println("********** Car **********");
    Car car = new Car();
    car.start();
    car.drive(); // Downcasting to access specific methods
    car.stop();

    System.out.println("********** Motorcycle (downcasting) **********");
    vehicle = new Motorcycle();
    vehicle.start();
    ((Motorcycle) vehicle).ride(); // Downcasting to access specific methods
    vehicle.stop();

    System.out.println("********** Motorcycle **********");
    Motorcycle motorcycle = new Motorcycle();
    motorcycle.start();
    motorcycle.ride(); // Downcasting to access specific methods
    motorcycle.stop();
  }
}
