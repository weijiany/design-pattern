public class ChangeColorObserve implements ClickableObserve {

    @Override
    public void clicked(Clickable clickable) {
        System.out.println("修改按钮-->颜色");
        Button b = (Button) clickable;
        b.setColor("红色");
    }
}
