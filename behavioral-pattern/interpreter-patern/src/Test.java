public class Test {

    public static void main(String[] args) {
        Variables variables = new Variables();

        Variable x = new Variable();
        Variable y = new Variable();
        variables.put(x, 1);
        variables.put(y, 2);

        // 计算 x + y
        ArithmeticExpression e = new Plus(x, y);
        System.out.println(e.interpret(variables));
    }
}
