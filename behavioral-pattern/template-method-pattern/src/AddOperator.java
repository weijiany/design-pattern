public class AddOperator extends Operator {

    public AddOperator() {
        super('+');
    }

    @Override
    protected double operate(double i, double j) {
        return i + j;
    }
}
