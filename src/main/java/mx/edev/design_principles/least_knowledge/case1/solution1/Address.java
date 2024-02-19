package mx.edev.design_principles.least_knowledge.case1.solution1;

public class Address {
  public void receiveStatement() {
    System.out.println("receiveStatement business logic");
    sendStatement();
  }

  private void sendStatement() {
    System.out.println("send statement");
  }
}
