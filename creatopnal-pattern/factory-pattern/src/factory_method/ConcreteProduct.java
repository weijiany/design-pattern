package factory_method;

/**
 * 具体产品
 * 该角色实现抽象产品角色所声明的接口，工厂方法创建的每一个对象都是某个具体产品角色的示例。
 */
public class ConcreteProduct implements Product {

    @Override
    public void method1() {
        System.out.println("执行 method1()");
    }
}
