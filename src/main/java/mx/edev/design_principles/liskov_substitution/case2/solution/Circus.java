package mx.edev.design_principles.liskov_substitution.case2.solution;

public class Circus {
  public void jumpRing(LightweightAnimal animal) {
    animal.walk();
    animal.jump();
    animal.walk();
  }
}
