package mx.edev.design_principles.open_close.case2.solution;

public class LaptopDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.9; // Apply 10% discount for laptops
    }
}