package mx.edev.design_principles.liskov_substitution.case1.violation;

class Rectangle extends Shape {

  // Constructor
  public Rectangle(double width, double height) {
    super(width, height);
  }
}
