package mx.edev.design_principles.dependency_inversion.case1.violation;

public class MasterCardPaymentGateway {
  public void processPayment(double amount) {
    // Code to process payment using MasterCard
    System.out.println("Processing payment via MasterCard: $" + amount);
  }
}
