package mx.edev.design_principles.interface_segregation.case1.violation;

public class InStoreOrder implements OrderProcessor {
  @Override
  public void ship() {
    throw new UnsupportedOperationException("In-store order cannot be shipped.");
  }

  @Override
  public void bill() {
    System.out.println("In-store order is being billed.");
  }
}
