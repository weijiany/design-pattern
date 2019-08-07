public class Test {

    public static void main(String[] args) {
        // 创建一个链
        Player player = new PlayerA(new PlayerB(new PlayerC(null)));
        player.handle(3);
    }
}
