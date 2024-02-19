package mx.edev.design_principles.least_knowledge.case1.solution2;

public class CustomerService {
  public void sendStatement(Customer customer, Address address) {
    System.out.println("sendStatement business logic");
    address.sendStatement();
  }
}
