package mx.edev.design_principles.solid.dependency_inversion.case1.solution;

public class PayPalPaymentGateway implements PaymentGateway {
  @Override
  public void processPayment(double amount) {
    // Code to process payment using PayPal
    System.out.println("Processing payment via PayPal: $" + amount);
  }
}
