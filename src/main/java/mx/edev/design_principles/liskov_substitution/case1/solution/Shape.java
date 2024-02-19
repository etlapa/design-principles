package mx.edev.design_principles.liskov_substitution.case1.solution;

public abstract class Shape {
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

  public abstract double getArea();
}
