package mx.edev.design_principles.interface_segregation.case2.violation;

public interface OrderProcessor {
    void ship();
    void bill();
}