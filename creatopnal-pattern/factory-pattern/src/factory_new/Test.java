package factory_new;

public class Test {

    public static void main(String[] args) {
        Product product1 = Creator.create(Product1::new);
        Product product2 = Creator.create(Product2::new);
        product1.method1();
        product2.method1();
    }
}
