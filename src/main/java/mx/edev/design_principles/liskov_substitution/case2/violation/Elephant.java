package mx.edev.design_principles.liskov_substitution.case2.violation;

public class Elephant extends Animal {
  @Override
  public void jump() throws Exception {
    throw new Exception("Elephants can't jump");
  }
}
