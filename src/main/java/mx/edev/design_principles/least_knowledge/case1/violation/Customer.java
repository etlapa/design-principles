package mx.edev.design_principles.least_knowledge.case1.violation;

public class Customer {
  private String name;
  private BankAccount bankAccount = new BankAccount();
  private Address address = new Address();

  public void payBill(double amount) {
    bankAccount.withdraw(amount); // Violates POLK
    address.sendStatement(); // Violates POLK
  }
}
