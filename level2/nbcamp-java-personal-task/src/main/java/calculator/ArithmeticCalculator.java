package calculator;

public class ArithmeticCalculator extends Calculator{
    Operator operator;

    // Setter 메서드
    public void setResultList(double result) {
        this.getResultList().add(result);
    }

    // Remove 사칙연산 첫 번째 결과값 삭제
    public void removeResult() {
        this.getResultList().remove(0);
    }

    //사칙연산 계산
    public double calculate(int num1, int num2, char operator) throws Exception {

        double result;
        switch (operator) {
            case '+':
                this.operator = new AddOperator();
                break;
            case '-':
                this.operator = new SubtractOperator();
                break;
            case '*':
                this.operator = new MultiplyOperator();
                break;
            case '/':
                if (num2 == 0) {
                    throw new Exception("나숫셈 연산자의 분모는 0이 될 수 없습니다."); // 나눗셈 연산 부모 정수 0일경우 예외 처리
                } else {
                    this.operator = new DivideOperator();
                }
                break;
            default:
                throw new Exception("올바른 사칙연산 기호를 입력해 주세요. (+, -, *, /)"); // 사칙연산 기호 예외처리
        }
        return result = this.operator.operate(num1, num2);
    }


}
