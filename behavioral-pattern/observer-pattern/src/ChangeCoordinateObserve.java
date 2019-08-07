public class ChangeCoordinateObserve implements ClickableObserve {

    @Override
    public void clicked(Clickable clickable) {
        System.out.println("修改按钮-->坐标");
        Button b = (Button) clickable;
        b.setX(10);
        b.setY(10);
    }
}
