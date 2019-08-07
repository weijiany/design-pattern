public class Context {

    private DiscountStrategy strategy;

    public Context(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double contextCalDisc() {
        return strategy.calculateDiscount();
    }
}
