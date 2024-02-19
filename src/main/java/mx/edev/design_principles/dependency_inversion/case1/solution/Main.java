package mx.edev.design_principles.dependency_inversion.case1.solution;

public class Main {
  public static void main(String[] args) {
    PayPalPaymentGateway payPalPaymentGateway = new PayPalPaymentGateway();
    PaymentProcessor paymentProcessor = new PaymentProcessor(payPalPaymentGateway);
    paymentProcessor.processPayment(99.90);
  }
}
