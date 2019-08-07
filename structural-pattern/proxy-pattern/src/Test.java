public class Test {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        IGamePlayer player = new GamePlayerProxy(gamePlayer);

        player.kill();
        System.out.println("==============");
        player.upLevel();
    }
}
