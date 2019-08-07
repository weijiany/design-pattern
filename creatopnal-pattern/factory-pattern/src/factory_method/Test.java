package factory_method;

/**
 * 测试工厂方法
 */
public class Test {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factory(ConcreteProduct.class);
        product.method1();
    }
}
