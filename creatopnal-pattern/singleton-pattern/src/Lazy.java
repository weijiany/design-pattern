/**
 * 懒汉式
 * 在第一次调用的时，创建对象
 * 必须要进行同步代码块，防止多个线程同时调用，创建多个对象
 */
public class Lazy {

    private static Lazy lazy = null;

    private Lazy() {}

    synchronized public static Lazy getLazy() {
        if (lazy == null) lazy = new Lazy();
        return lazy;
    }
}
