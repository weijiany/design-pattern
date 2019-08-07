public class DivOperator extends Operator {

    public DivOperator() {
        super('-');
    }

    @Override
    protected double operate(double i, double j) {
        return i - j;
    }

    @Override
    public void template(double i, double j) {
        super.template(i, j);
    }
}
