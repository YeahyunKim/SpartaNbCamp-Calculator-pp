package calculator;

public class DivideOperator implements Operator {
    @Override
    public double operate(double num1, double num2) {
        return (double)num1 / num2;
    }
}
