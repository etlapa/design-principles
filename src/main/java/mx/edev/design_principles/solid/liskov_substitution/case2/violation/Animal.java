package mx.edev.design_principles.solid.liskov_substitution.case2.violation;

public class Animal {
  public void walk() {
    System.out.println("walk");
  }

  public void jump() throws Exception {
    System.out.println("jump");
  }
}
