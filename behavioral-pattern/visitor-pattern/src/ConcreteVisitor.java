public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(ConcreteElement1 element) {
        element.operation();
    }

    @Override
    public void visit(ConcreteElement2 element) {
        element.operation();
    }
}
