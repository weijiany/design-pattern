public class Test {

    public static void main(String[] args) {
        ConcreteVisitor visitor = new ConcreteVisitor();

        ObjectStructure structure = new ObjectStructure();
        structure.action(visitor);
    }
}
