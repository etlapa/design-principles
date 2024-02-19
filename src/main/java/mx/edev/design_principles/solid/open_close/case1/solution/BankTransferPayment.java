package mx.edev.design_principles.solid.open_close.case1.solution;

// Concrete implementation for bank transfer payment
public class BankTransferPayment implements PaymentMethod {
  @Override
  public void processPayment() {
    // Processing bank transfer payment
    System.out.println("Processing bank transfer payment...");
  }
}
