package mx.edev.design_principles.dependency_inversion.case1.violation;

public class PayPalPaymentGateway {
  public void processPayment(double amount) {
    // Code to process payment using PayPal
    System.out.println("Processing payment via PayPal: $" + amount);
  }
}
