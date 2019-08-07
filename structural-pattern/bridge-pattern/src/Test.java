public class Test {

    public static void main(String[] args) {
        Color red = new Red();
        AbstractShape circle = new Circle(red);
        circle.draw();
    }
}
