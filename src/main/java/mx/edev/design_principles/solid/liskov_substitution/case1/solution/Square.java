package mx.edev.design_principles.solid.liskov_substitution.case1.solution;

class Square extends Shape {
  protected Square(double side) {
    super(side, side);
  }

  @Override
  public double getArea() {
    return height * width;
  }
}
