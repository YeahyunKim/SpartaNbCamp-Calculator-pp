package calculator;

import java.util.concurrent.ExecutionException;

public enum OperatorType {
    ADD('+', new AddOperator()),
    SUBTRACT('-', new SubtractOperator()),
    MULTIPLY('*', new MultiplyOperator()),
    DIVIDE('/', new DivideOperator()),
    MODULO('%', new ModOperator());
    final char Symbol;

    private final Operator operator;

    OperatorType(char symbol, Operator operator) {
        this.Symbol = symbol;
        this.operator = operator;
    }

    public char getSymbol() {
        return this.Symbol;
    }

    public Operator getOperator(){
        return operator;
    }

    public static Operator checkOperator(char operatorSymbol) throws Exception {
        return switch (operatorSymbol) {
            case '+' -> new AddOperator();
            case '-' -> new SubtractOperator();
            case '*' -> new MultiplyOperator();
            case '/' -> new DivideOperator();
            case '%' -> new ModOperator();
            default -> throw new Exception("올바른 연산 기호를 입력해 주세요. (+, -, *, /, %)");
        };
    }
//
//    public static OperatorType getBySymbol(char symbol) throws Exception {
//        for (OperatorType type : values()) {
//            if (type.getSymbol() == symbol) {
//                return type;
//            }
//        }
//        throw new Exception("올바른 연산 기호를 입력해 주세요. (+, -, *, /, %)");
//    }
}

