package mx.edev.design_principles.liskov_substitution.case1.violation;

class Square extends Rectangle {
  // Constructor
  public Square(double side) {
    super(side, side);
  }
}
