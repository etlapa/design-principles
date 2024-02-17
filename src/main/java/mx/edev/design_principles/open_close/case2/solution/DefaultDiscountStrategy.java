package mx.edev.design_principles.open_close.case2.solution;

public class DefaultDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price; // No discount
    }
}