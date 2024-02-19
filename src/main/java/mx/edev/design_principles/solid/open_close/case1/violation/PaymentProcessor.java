package mx.edev.design_principles.solid.open_close.case1.violation;

public class PaymentProcessor {
  private String type;

  public PaymentProcessor(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  // Violation: This method needs to be modified every time a new payment method is added.
  public void processPayment() {
    if (type.equals("CreditCard")) {
      // Processing credit card payment
      System.out.println("Processing credit card payment...");
    } else if (type.equals("PayPal")) {
      // Processing PayPal
      System.out.println("Processing paypal payment...");
    } else {
      throw new UnsupportedOperationException("Payment not supported: " + type);
    }
  }
}
