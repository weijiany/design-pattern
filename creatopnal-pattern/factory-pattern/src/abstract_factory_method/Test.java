package abstract_factory_method;

/**
 * 测试抽象工厂方法
 */
public class Test {

    public static void main(String[] args) {
        Factory factory = new Factory();

        // 生产 ProductA
        ProductA productA1 = factory.factoryA(ProductA1.class);
        ProductA productA2 = factory.factoryA(ProductA2.class);
        productA1.method1();
        productA2.method1();

        // 生产 ProductB
        ProductB productB1 = factory.factoryB(ProductB1.class);
        ProductB productB2 = factory.factoryB(ProductB2.class);
        productB1.method1();
        productB2.method1();
    }
}
