package mx.edev.design_principles.solid.open_close.case1.solution;

// Concrete implementation for credit card payment
public class CreditCardPayment implements PaymentMethod {
  @Override
  public void processPayment() {
    // Processing credit card payment
    System.out.println("Processing credit card payment...");
  }
}
