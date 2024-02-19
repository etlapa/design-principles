package mx.edev.design_principles.liskov_substitution.case1.violation;

public class Main {
  public static void main(String[] args) {
    Shape rectangle = new Rectangle(4, 2);
    Shape square = new Square(4);
    System.out.println(
        "Rectangle, height: "
            + rectangle.getHeight()
            + ", width="
            + rectangle.getWidth()
            + ", area: "
            + rectangle.getArea());
    System.out.println(
        "Square, height: "
            + square.getHeight()
            + ", width="
            + square.getWidth()
            + ", area: "
            + square.getArea());
    System.out.println("********* Liskov validation *********");
    Rectangle newRectangle = new Square(4);
    System.out.println(
        "Rectangle, height: "
            + square.getHeight()
            + ", width="
            + square.getWidth()
            + ", area: "
            + square.getArea());
  }
}
