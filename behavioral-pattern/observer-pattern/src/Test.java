public class Test {

    public static void main(String[] args) {
        Button b = new Button("白色", 0, 0);

        b.addClickableObserve(new ChangeColorObserve());
        b.addClickableObserve(new ChangeCoordinateObserve());
        b.addClickableObserve(new OtherObserve());

        // 相当于 notify()
        b.click();
        System.out.println(b);
    }
}
