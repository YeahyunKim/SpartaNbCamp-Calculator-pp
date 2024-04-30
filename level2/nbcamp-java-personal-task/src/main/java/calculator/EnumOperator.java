package calculator;

import java.util.concurrent.ExecutionException;

public class EnumOperator{
    public enum OperatorType  {
        ADD('+'),
        SUBTRACT('-'),
        MULTIPLY('*'),
        DIVIDE('/'),
        MODULO('%');
        final char Symbol;

        OperatorType(char symbol) {
            this.Symbol = symbol;
        }

        public char getSymbol() {
            return this.Symbol;
        }

        public static OperatorType checkSymbol(char symbol) {
            for (OperatorType ot : OperatorType.values()) {
                if (ot.getSymbol() == symbol) {
                    return ot;
                }
            }
            return null;
        }
    }
}
