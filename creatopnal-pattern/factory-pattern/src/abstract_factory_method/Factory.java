package abstract_factory_method;

import java.lang.reflect.InvocationTargetException;

/**
 * 具体工厂方法
 */
public class Factory implements AbstractFactory {

    @Override
    public <T extends ProductA> T factoryA(Class<T> c) {
        T productA = null;
        try {
            productA = c.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return  productA;
    }

    @Override
    public <T extends ProductB> T factoryB(Class<T> c) {
        T productB = null;
        try {
            productB = c.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return productB;
    }
}
