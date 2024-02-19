package mx.edev.design_principles.solid.liskov_substitution.case1.violation;

class Shape {
  protected final double height;
  protected final double width;

  protected Shape(double width, double height) {
    this.height = height;
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public double getWidth() {
    return width;
  }

  // Method to calculate area
  public double getArea() {
    return height * width;
  }
}
