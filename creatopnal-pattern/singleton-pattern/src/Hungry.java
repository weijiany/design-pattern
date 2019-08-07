/**
 * 饿汉式，单例模式
 *
 * 在类被加载的时候，创建对象
 */
public class Hungry {

    private static Hungry hungry = new Hungry();

    private Hungry(){}

    public static Hungry getHungry() {
        return Hungry.hungry;
    }
}
