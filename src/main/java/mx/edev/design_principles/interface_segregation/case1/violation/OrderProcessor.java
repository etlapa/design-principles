package mx.edev.design_principles.interface_segregation.case1.violation;

public interface OrderProcessor {
  void ship();

  void bill();
}
