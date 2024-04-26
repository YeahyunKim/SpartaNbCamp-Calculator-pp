package calculator;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Double> resultList = new ArrayList<>();
    char[] operators = {'+', '-', '*', '/'}; // 사칙연산 기호 배열 생성

    public double calculate(int num1, int num2, char operator) throws Exception {

        if (!isValidOperator(operator)) { // 옳바른 사칙연산 기호 확인
            throw new Exception("사칙연산만 입력 가능합니다. (+, -, *, /)");
        }

        if (num2 == 0 && operator == '/') { // 나눗셈 연산 부모 정수 확인
            throw new Exception("나숫셈 연산자의 분모는 0이 될 수 없습니다.");
        }

        return switch (operator) { // 연산 실행 로직
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (double) num1 / num2;
            default -> 0;
        };
    }

    public boolean isValidOperator(char operator) { //사칙연산 이외의 문자를 받았을 때 확인하는 로직
        boolean valid = false;
        for (char op : operators) {
            if (operator == op) {
                valid = true;
            } else {
                valid = false;
            }
        }
        return valid;
    }
}
