import java.util.ArrayList;
import java.util.List;

public class Button implements Clickable {

    private List<ClickableObserve> observes = new ArrayList<>();

    private String color;

    private int x;

    private int y;

    @Override
    public void click() {
        System.out.println("按钮被点击，执行所有观察者的 clicked() 方法");
        for (ClickableObserve observe: observes)
            observe.clicked(this);
    }

    @Override
    public void addClickableObserve(ClickableObserve observe) {
        observes.add(observe);
    }

    public Button(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Button{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
