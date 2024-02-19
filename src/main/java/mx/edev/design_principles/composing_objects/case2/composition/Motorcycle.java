package mx.edev.design_principles.composing_objects.case2.composition;

// Class representing a Motorcycle
class Motorcycle implements Vehicle {
  public void start() {
    System.out.println("Starting the motorcycle...");
  }

  public void stop() {
    System.out.println("Stopping the motorcycle...");
  }

  public void ride() {
    System.out.println("Riding the motorcycle...");
  }

  public void park() {
    System.out.println("Parking the motorcycle...");
  }
}
