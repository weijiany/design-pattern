import java.util.Date;

public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void kill() {
        System.out.println("时间：" + new Date().toString());
        gamePlayer.kill();
    }

    @Override
    public void upLevel() {
        System.out.println("1h 升1级");
        gamePlayer.upLevel();
    }
}
