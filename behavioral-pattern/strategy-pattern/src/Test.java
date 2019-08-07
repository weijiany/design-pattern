public class Test {

    public static void main(String[] args) {
        Context context = null;
        context = new Context(new NoDiscountStrategy(10.0, 10));
        System.out.println(context.contextCalDisc());


        context = new Context(new PercentageDiscountStrategy(10.0, 10, 0.8));
        System.out.println(context.contextCalDisc());
    }
}
