package mx.edev.design_principles.dependency_inversion.case1.solution;

public class MasterCardPaymentGateway implements PaymentGateway {
  @Override
  public void processPayment(double amount) {
    // Code to process payment using MasterCard
    System.out.println("Processing payment via MasterCard: $" + amount);
  }
}
