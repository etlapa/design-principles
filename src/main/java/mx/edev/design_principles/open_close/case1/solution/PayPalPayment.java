package mx.edev.design_principles.open_close.case1.solution;

/** Concrete implementation for PayPal payment */
public class PayPalPayment implements PaymentMethod {
  @Override
  public void processPayment() {
    // Processing PayPal payment
    System.out.println("Processing PayPal payment...");
  }
}
