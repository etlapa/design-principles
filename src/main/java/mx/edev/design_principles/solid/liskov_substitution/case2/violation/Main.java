package mx.edev.design_principles.solid.liskov_substitution.case2.violation;

public class Main {
  public static void main(String[] args) throws Exception {
    //    case1();
    case2();
  }

  private static void case1() throws Exception {
    Animal animal = new Animal();
    Elephant elephant = new Elephant();
    Animal newAnimal = new Elephant();
    System.out.print("Animal: ");
    animal.jump();
    System.out.print("Elephant: ");
    elephant.jump();
    System.out.println("********* Liskov validation *********");
    animal = elephant;
    System.out.print("Animal (violation): ");
    animal.jump();
    System.out.print("Animal (violation): ");
    newAnimal.jump();
  }

  private static void case2() throws Exception {
    Animal animal = new Elephant();
    Circus circus = new Circus();
    circus.jumpHoop(animal);
  }
}
