package mx.edev.design_principles.least_knowledge.case1.solution2;

public class PaymentService {
  public void payBill(Customer customer, BankAccount account, double amount) {
    System.out.println("payBill business logic");
    account.withdraw(amount);
  }
}
