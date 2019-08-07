public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void kill() {
        System.out.println(name + "在打怪");
    }

    @Override
    public void upLevel() {
        System.out.println(name + "升级");
    }
}
