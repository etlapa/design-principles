package mx.edev.design_principles.least_knowledge.case1.solution1;

public class Customer {
  private String name;
  private BankAccount bankAccount = new BankAccount();
  private Address address = new Address();

  public void payBill(double amount) {
    bankAccount.payBill(amount); // Delegates to dedicated method
    address.receiveStatement(); // Delegates to dedicated method
  }
}
