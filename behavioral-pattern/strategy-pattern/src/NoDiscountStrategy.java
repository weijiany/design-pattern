public class NoDiscountStrategy extends DiscountStrategy {


    public NoDiscountStrategy(double price, int number) {
        super(price, number);
    }

    @Override
    protected double calculateDiscount() {
        return this.getNumber() * this.getPrice();
    }
}
