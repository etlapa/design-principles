package mx.edev.design_principles.liskov_substitution.case1.solution;

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
    Shape newRectangle = new Rectangle(4, 2);
    System.out.println(
        "Rectangle, height: "
            + square.getHeight()
            + ", width="
            + square.getWidth()
            + ", area: "
            + square.getArea());
    Shape newSquare = new Square(4);
    System.out.println(
        "Square, height: "
            + square.getHeight()
            + ", width="
            + square.getWidth()
            + ", area: "
            + square.getArea());
  }
}
