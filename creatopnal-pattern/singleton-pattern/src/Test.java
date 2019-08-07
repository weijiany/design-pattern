public class Test {

    public static void main(String[] args) {
        Hungry h1 = Hungry.getHungry();
        Hungry h2 = Hungry.getHungry();
        System.out.println(h1.equals(h2));

        Lazy l1 = Lazy.getLazy();
        Lazy l2 = Lazy.getLazy();
        System.out.println(l1.equals(l2));
    }
}
