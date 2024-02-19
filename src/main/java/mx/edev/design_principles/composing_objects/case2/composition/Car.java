package mx.edev.design_principles.composing_objects.case2.composition;

// Class representing a Car
class Car implements Vehicle {
  public void start() {
    System.out.println("Starting the car...");
  }

  public void stop() {
    System.out.println("Stopping the car...");
  }

  public void drive() {
    System.out.println("Driving the car...");
  }

  public void park() {
    System.out.println("Parking the car...");
  }
}
