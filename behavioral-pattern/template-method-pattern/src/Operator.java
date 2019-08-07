public abstract class Operator {

    protected char c;

    protected abstract double operate(double i, double j);

    public Operator(char c) {
        this.c = c;
    }

    public void template(double i, double j) {
        System.out.println("" + i + c + j + "=" + this.operate(i, j));
    }
}
