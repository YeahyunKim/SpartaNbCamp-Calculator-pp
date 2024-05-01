package calculator;

public class ModOperator implements Operator{
    public double operate(double num1, double num2) {
        return (double) num1 % num2;
    }
}