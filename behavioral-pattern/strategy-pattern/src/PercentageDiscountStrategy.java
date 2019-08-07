public class PercentageDiscountStrategy extends DiscountStrategy {

    private double strategy ;

    public PercentageDiscountStrategy(double price, int number, double strategy) {
        super(price, number);
        this.strategy = strategy;
    }

    @Override
    protected double calculateDiscount() {
        return this.getNumber() * this.getPrice() * strategy;
    }
}
