package mx.edev.design_principles.solid.open_close.case1.solution;

// Context class that uses the PaymentMethod interface
public class PaymentProcessor {
  private PaymentMethod paymentMethod;

  public PaymentProcessor(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void processPayment() {
    paymentMethod.processPayment();
  }
}
