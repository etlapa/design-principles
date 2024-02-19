package mx.edev.design_principles.composing_objects.case2.inheritance;

// Subclass Car inheriting from Vehicle
class Car extends Vehicle {
  public void drive() {
    System.out.println("Driving the car...");
  }

  public void park() {
    System.out.println("Parking the car...");
  }
}
