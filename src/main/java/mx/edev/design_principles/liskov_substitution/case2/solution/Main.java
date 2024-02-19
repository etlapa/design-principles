package mx.edev.design_principles.liskov_substitution.case2.solution;

public class Main {
  public static void main(String[] args) {
    case1();
    case2();
  }

  private static void case1() {
    LightweightAnimal animal = new LightweightAnimal();
    Dog dog = new Dog();
    LightweightAnimal newAnimal = new Dog();
    System.out.print("Animal: ");
    animal.jump();
    System.out.print("Dog: ");
    dog.jump();
    animal = dog;
    System.out.print("Animal: ");
    animal.jump();
    System.out.print("Animal: ");
    newAnimal.jump();
  }

  private static void case2() {
    LightweightAnimal animal = new Dog();
    Circus circus = new Circus();
    circus.jumpRing(animal);
  }
}
