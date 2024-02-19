package mx.edev.design_principles.dependency_inversion.case1.solution;

public interface PaymentGateway {
  void processPayment(double amount);
}
