public abstract class AbstractShape {

    public Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
