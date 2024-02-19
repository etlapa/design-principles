package mx.edev.design_principles.interface_segregation.case1.violation;

public class OnlineOrder implements OrderProcessor {
  @Override
  public void ship() {
    System.out.println("Online order is being shipped.");
  }

  @Override
  public void bill() {
    System.out.println("Online order is being billed.");
  }
}
