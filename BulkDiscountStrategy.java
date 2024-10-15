public class BulkDiscountStrategy implements PricingStrategy {
    private int bulkThreshold;
    private double discount;

    public BulkDiscountStrategy(int bulkThreshold, double discount) {
        this.bulkThreshold = bulkThreshold;
        this.discount = discount;
    }

    @Override
    public double applyDiscount(double basePrice) {
        return bulkThreshold > 10 ? basePrice - discount : basePrice;
    }
}
