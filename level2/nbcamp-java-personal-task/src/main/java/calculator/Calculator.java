package calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Double> resultList;
    private ArrayList<Double> circleAreaResultList;
    public static final double PI = 3.14; // PI는 변하지않는 상수로 활용해야 하기 때문에 static final를 사용

    // 생성자
    public Calculator() {
        this.resultList = new ArrayList<>();
        this.circleAreaResultList = new ArrayList<>();
    }

    // Getter 메서드
    public ArrayList<Double> getResultList() {
        return this.resultList;
    }

    // Getter 메서드
    public ArrayList<Double> getCircleAreaResultList() {
        return this.circleAreaResultList;
    }


    // 결과값 조회하기
    public void inquiryResults(String showResultList, String calculateType, ArrayList<Double> list) {
        if (showResultList.equals("inquiry")) {
            System.out.print("저장된 " + calculateType + " 결과 리스트를 불러옵니다. [ ");
            int index = 0;
            for (Double value : list) {
                if (list.size() - 1 == index) {
                    System.out.print(value);
                } else {
                    System.out.print(value + " | ");
                }
                index++;
            }
            System.out.print(" ]\n");
        }
    }
//
//    // 원의 넓이 결과값 조회하기
//    public void inquiryCircleAreaResults(String showResultList, ArrayList<Double> list) {
//        if (showResultList.equals("inquiry")) {
//            System.out.print("저장된 원 넓이 리스트를 불러옵니다. [ ");
//            int index = 0;
//            for (Double value : circleAreaResultList) {
//                if (circleAreaResultList.size() - 1 == index) {
//                    System.out.print(value);
//                } else {
//                    System.out.print(value + " | ");
//                }
//                index++;
//            }
//            System.out.print(" ]\n");
//        }
//    }
    // 원의 넓이 구하기
    public double calculateCircleArea(int circleRadius) {
        return circleRadius * circleRadius * PI;
    }

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
