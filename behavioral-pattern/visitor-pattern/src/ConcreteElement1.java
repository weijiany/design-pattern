public class ConcreteElement1 extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operation() {
        System.out.println("访问元素1");
    }
}
