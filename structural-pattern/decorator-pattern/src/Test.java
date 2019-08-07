public class Test {

    public static void main(String[] args) {
        Car car = new Benz();
        ConcreteCarDecorator decorator = new ConcreteCarDecorator(car);

        decorator.show();
    }
}
