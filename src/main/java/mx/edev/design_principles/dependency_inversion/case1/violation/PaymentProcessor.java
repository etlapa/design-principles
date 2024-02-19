package mx.edev.design_principles.dependency_inversion.case1.violation;

public class PaymentProcessor {
  private PaymentType paymentType;

  public PaymentProcessor(PaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public void processPayment(double amount) {
    switch (paymentType) {
      case PAYPAL -> {
        PayPalPaymentGateway paymentGateway = new PayPalPaymentGateway();
        paymentGateway.processPayment(amount);
      }
      case MASTER_CARD -> {
        MasterCardPaymentGateway masterCardPaymentGateway = new MasterCardPaymentGateway();
        masterCardPaymentGateway.processPayment(amount);
      }
      default -> throw new UnsupportedOperationException("Unsupported Payment type");
    }
  }
}
