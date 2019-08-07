public abstract class Player {

    private Player successor;

    // 业务处理方法
    public abstract void handle(int i);

    protected void setSuccessor(Player successor) {
        this.successor = successor;
    }

    // 看是不是该当前来处理这个请求
    public void next(int index) {
        if (successor != null) successor.handle(index);
        else System.out.println("游戏结束");
    }
}
