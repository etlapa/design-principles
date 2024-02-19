package mx.edev.design_principles.open_close.case2.solution;

public class Product {
  private String name;
  private double price;
  private DiscountStrategy discountStrategy;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public Product(String name, double price, DiscountStrategy discountStrategy) {
    this.name = name;
    this.price = price;
    this.discountStrategy = discountStrategy;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  // Using Strategy Pattern to apply discount
  public double calculateDiscountedPrice() {
    if (discountStrategy != null) {
      return discountStrategy.applyDiscount(price);
    }
    return price;
  }
}
