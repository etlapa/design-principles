package mx.edev.design_principles.least_knowledge.case1.solution2;

public class Customer {
  private String name;
  private BankAccount bankAccount = new BankAccount();
  private PaymentService paymentService = new PaymentService();
  private Address address = new Address();
  private CustomerService customerService = new CustomerService();

  public void payBill(double amount) {
    paymentService.payBill(this, bankAccount, amount);
    customerService.sendStatement(this, address);
  }
}