package factory_method;

/**
 * 抽象工厂
 * 该角色是工厂方法模式的核心，与应用系统无关，任何在创建对象的工厂类必须实现这个接口。
 */
public interface Creator {

    <T extends Product> T factory(Class<T> c);
}
