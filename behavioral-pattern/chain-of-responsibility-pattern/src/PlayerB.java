public class PlayerB extends Player {

    public PlayerB(Player successor) {
        setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if (i == 2) System.out.println("playerB 喝酒~");
        else {
            System.out.println("playerB 把花向下传递");
            next(i);
        }
    }
}
