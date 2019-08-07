package abstract_factory_method;

/**
 * 具体工厂方法
 */
@SuppressWarnings("unchecked")
public class Factory implements AbstractFactory {

    @Override
    public <T extends ProductA> T factoryA(Class<T> c) {
        ProductA productA = null;
        try {
            productA = (ProductA) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) productA;
    }

    @Override
    public <T extends ProductB> T factoryB(Class<T> c) {
        ProductB productB = null;
        try {
            productB = (ProductB) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) productB;
    }
}
