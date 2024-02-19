package mx.edev.design_principles.composing_objects.case2.inheritance;

public class Main {
  public static void main(String[] args) {
    System.out.println("********** Car **********");
    Car car = new Car();
    car.start();
    car.drive();
    car.stop();

    System.out.println("********** Motorcycle **********");
    Motorcycle motorcycle = new Motorcycle();
    motorcycle.start();
    motorcycle.ride();
    motorcycle.stop();
  }
}
