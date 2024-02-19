package mx.edev.design_principles.solid.open_close.case2.violation;

public class Product {
  private String name;
  private double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  // Violation: This method needs to be modified every time a discount is added.
  public double calculateDiscountedPrice() {
    if (name.equals("Laptop")) {
      return price * 0.9; // Apply 10% discount for laptops
    } else if (name.equals("Smartphone")) {
      return price * 0.8; // Apply 20% discount for smartphones
    } else {
      return price; // No discount for other products
    }
  }
}
