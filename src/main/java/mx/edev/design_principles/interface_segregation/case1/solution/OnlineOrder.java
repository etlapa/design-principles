package mx.edev.design_principles.interface_segregation.case1.solution;

public class OnlineOrder implements Shippable, Billable {
  @Override
  public void ship() {
    System.out.println("Online order is being shipped.");
  }

  @Override
  public void bill() {
    System.out.println("Online order is being billed.");
  }
}
