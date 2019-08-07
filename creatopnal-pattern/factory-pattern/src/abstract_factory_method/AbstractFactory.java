package abstract_factory_method;

/**
 * 抽象工厂方法
 */
public interface AbstractFactory {

    // 生成 ProductA 的方法
    <T extends ProductA> T factoryA(Class<T> c);

    // 生成 ProductB 的方法
    <T extends ProductB> T factoryB(Class<T> c);
}
