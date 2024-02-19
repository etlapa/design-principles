package mx.edev.design_principles.solid.liskov_substitution.case1.solution;

class Rectangle extends Shape {
  protected Rectangle(double width, double height) {
    super(width, height);
  }

  @Override
  public double getArea() {
    return height * width;
  }
}
