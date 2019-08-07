public class PlayerC extends Player {

    public PlayerC(Player successor) {
        setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if (i == 3) System.out.println("playerC 喝酒~");
        else {
            System.out.println("playerC 把花向下传递");
            next(i);
        }
    }
}
