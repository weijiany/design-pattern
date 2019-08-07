package factory_method;

/**
 * 具体工厂
 * 该角色实现了抽象工厂接口，含有与应用密切相关的逻辑，并且受到应用程序的调用以创建产品对象。
 */
@SuppressWarnings("unchecked")
public class ConcreteCreator implements Creator {

    @Override
    public <T extends Product> T factory(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
