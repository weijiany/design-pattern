public class OtherObserve implements ClickableObserve {

    @Override
    public void clicked(Clickable clickable) {
        System.out.println("执行其他操作");
    }
}
