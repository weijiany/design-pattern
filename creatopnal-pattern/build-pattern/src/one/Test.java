package one;

/**
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector(new X201Builder());
        X201 x201 = director.constructX201();
        System.out.println(x201);
    }
}
