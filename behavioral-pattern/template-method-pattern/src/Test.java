public class Test {

    public static void main(String[] args) {
        Operator add = new AddOperator();
        add.template(1, 2);
        Operator div = new DivOperator();
        div.template(10, 11);
    }
}
