package mx.edev.design_principles.solid.dependency_inversion.case1.solution;

public class PaymentProcessor {
  private PaymentGateway paymentGateway;

  public PaymentProcessor(PaymentGateway paymentGateway) {
    this.paymentGateway = paymentGateway;
  }

  public void processPayment(double amount) {
    paymentGateway.processPayment(amount);
  }
}
