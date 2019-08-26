package five;

/**
 * 静态内部类，在使用的时候才进行加载，可以做到延迟加载
 */
public class Singleton {

    private Singleton() {}

    public static Singleton getInstance() {
        return SingletonInner.singleton;
    }

    private static class SingletonInner {
        static Singleton singleton = new Singleton();
    }
}
