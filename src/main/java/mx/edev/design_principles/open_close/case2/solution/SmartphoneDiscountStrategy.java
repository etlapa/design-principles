package mx.edev.design_principles.open_close.case2.solution;

public class SmartphoneDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.8; // Apply 20% discount for smartphones
    }
}