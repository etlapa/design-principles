package mx.edev.design_principles.interface_segregation.case1.solution;

public class InStoreOrder implements Billable {
  @Override
  public void bill() {
    System.out.println("In-store order is being billed.");
  }
}
