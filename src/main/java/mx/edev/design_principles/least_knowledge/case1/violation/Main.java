package mx.edev.design_principles.least_knowledge.case1.violation;

public class Main {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.payBill(99.90);
  }
}