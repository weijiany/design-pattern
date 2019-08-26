package factory_method;

import java.lang.reflect.InvocationTargetException;

/**
 * 具体工厂
 * 该角色实现了抽象工厂接口，含有与应用密切相关的逻辑，并且受到应用程序的调用以创建产品对象。
 */
public class ConcreteCreator implements Creator {

    @Override
    public <T extends Product> T factory(Class<T> c) {
        T product = null;
        try {
            product = c.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return product;
    }
}
