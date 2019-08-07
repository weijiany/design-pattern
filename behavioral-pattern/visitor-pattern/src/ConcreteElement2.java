public class ConcreteElement2 extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operation() {
        System.out.println("访问元素2");
    }
}
