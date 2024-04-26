package calculator;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Double> resultList = new ArrayList<>();

    public double calculate(int num1, int num2, char operator) throws Exception {

        // 사칙연산 수행
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new Exception("나숫셈 연산자의 분모는 0이 될 수 없습니다."); // 나눗셈 연산 부모 정수 0일경우 예외 처리
                } else {
                    result = (double) num1 / num2;
                }
                break;
            default:
                throw new Exception("올바른 사칙연산 기호를 입력해 주세요. (+, -, *, /)"); // 사칙연산 기호 예외처리
        }
        return result;
    }
}