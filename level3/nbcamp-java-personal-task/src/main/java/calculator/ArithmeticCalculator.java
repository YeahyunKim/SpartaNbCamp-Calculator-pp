package calculator;

public class ArithmeticCalculator extends Calculator{

    // Setter 메서드
    public void setResultList(double result) {
        this.getResultList().add(result);
    }

    // Remove 사칙연산 첫 번째 결과값 삭제
    public void removeResult() {
        this.getResultList().remove(0);
    }


    //연산 계산
//    public <T extends Number> T calculate(T num1, T num2, char operatorSymbol) throws Exception {
//        OperatorType operatorType = OperatorType.getBySymbol(operatorSymbol);
//        System.out.println(operatorType);
//    }


    //연산 계산
    public <T extends Number> double calculate(T num1, T num2, char operatorSymbol) throws Exception {
        if ((operatorSymbol == '/') || (operatorSymbol == '%')) {
            if (num2.doubleValue() == 0) {
                throw new ArithmeticException("분모가 0인 경우, 나눗셈 / 나머지 연산을 진행할 수 없습니다.");
            }
        }

        Operator operator = OperatorType.checkOperator(operatorSymbol);
        return operator.operate(num1.doubleValue(), num2.doubleValue());

    }

    //큰값 조회
    public void printGreaterNum(double input){
        System.out.println(this.getResultList().stream().filter(x->x>input).toList());
    }
}


