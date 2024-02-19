package mx.edev.design_principles.solid.liskov_substitution.case2.violation;

public class Circus {
  public void jumpHoop(Animal animal) throws Exception {
    animal.walk();
    animal.jump();
    animal.walk();
  }
}
