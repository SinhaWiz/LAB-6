public class PercentageDiscountStrategy implements PricingStrategy {
    private double discountPercentage;

    public PercentageDiscountStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount(double basePrice) {
        return basePrice * (1 - discountPercentage / 100);
    }
}
