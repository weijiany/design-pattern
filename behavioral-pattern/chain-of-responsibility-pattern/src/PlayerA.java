public class PlayerA extends Player {

    public PlayerA(Player successor) {
        setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if (i == 1) System.out.println("playerA 喝酒~");
        else {
            System.out.println("playerA 把花向下传递");
            next(i);
        }
    }
}
