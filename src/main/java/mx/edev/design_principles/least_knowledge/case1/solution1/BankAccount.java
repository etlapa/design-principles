package mx.edev.design_principles.least_knowledge.case1.solution1;

public class BankAccount {
  public void payBill(double amount) {
    System.out.println("payBill business logic");
    withdraw(amount);
  }

  private void withdraw(double amount) {
    System.out.println("withdraw");
  }
}
