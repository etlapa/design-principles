package mx.edev.design_principles.composing_objects.case2.inheritance;

// Subclass Motorcycle inheriting from Vehicle
class Motorcycle extends Vehicle {
  public void ride() {
    System.out.println("Riding the motorcycle...");
  }

  public void park() {
    System.out.println("Parking the motorcycle...");
  }
}
