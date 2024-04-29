package calculator;

public class DivideOperator implements Operator {

    @Override
    public double operate(int num1, int num2) {
        return (double)num1 / num2;
    }
}
