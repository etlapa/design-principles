package mx.edev.design_principles.solid.dependency_inversion.case1.violation;

public class Main {
  public static void main(String[] args) {
    System.out.println("********** PayPal payment **********");
    PaymentProcessor paymentProcessor = new PaymentProcessor(PaymentType.PAYPAL);
    paymentProcessor.processPayment(99.90);
    System.out.println("********** MasterCard payment **********");
    paymentProcessor = new PaymentProcessor(PaymentType.MASTER_CARD);
    paymentProcessor.processPayment(99.90);
  }
}
