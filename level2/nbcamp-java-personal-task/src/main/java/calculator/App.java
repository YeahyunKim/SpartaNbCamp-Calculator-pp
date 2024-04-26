package calculator;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Calculator calculator = new Calculator(); // calculator 객체 생성

        char continueCalculation = 'y'; // 계산기 추가 사용 여부

        String saveResult; // 연산 결과 개수가 10개 이상일 때, 결과를 저장할지 여부 확인 변수

        String showResultList; // 결과값 모두 조회 여부 확인 변수

        double result;

        /* [ 계산기 실행 시작 ] */
        while (continueCalculation == 'y') {
            System.out.println("============================");
            System.out.println("====== 계산기를 실행합니다 ======");

            /* [ 정수 2개 사칙연산 기호 입력 영역 ] */
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = input.nextInt(); //첫 번째 숫자 값을 입력하고 num1에 저장

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = input.nextInt(); //두 번째 숫자 값을 입력하고 num1에 저장

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = input.next().charAt(0); //사칙연산 기호 값을 입력하고 operator에 저장
            input.nextLine();


            /* [ 연산 결과 리스트에 추가 / 결과 출력 / 예외처리 영역 ] */
            try {
                result = calculator.calculate(num1, num2, operator);
                calculator.setResultList(calculator.calculate(num1, num2, operator)); // 에러사항이 없을 시, resultList에 결과값 저장
                System.out.println("결과: " + result);
            } catch (Exception e) {
                System.out.println(e.getMessage()); //에러사항이 있을 시, 에러 메세지 출력
            }


            /* [ 첫 번째 연산 결과 삭제 영역 ] */
            if (calculator.getResultList().size() > 0) { // resultList에 결과값이 있을 경우
                System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? remove(삭제) / 아무키 입력(삭제안함): ");
                saveResult = input.nextLine();

                if (saveResult.equals("remove")) { // remove 입력 시, 데이터 삭제 조건문
                    calculator.removeResult(); // 첫 번째 결과값 삭제
                }
            }


            /* [ 모든 연산 결과 조회 영역 ] */
            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry(조회) / 아무키 입력(조회안함): ");
            showResultList = input.nextLine();

            if (showResultList.equals("inquiry")) {
                System.out.print("저장된 결과 리스트를 불러옵니다. [ ");
                int index = 0;
                for (Double value : calculator.getResultList()) {
                    if (calculator.getResultList().size()-1 == index) {
                        System.out.print(value);
                    } else {
                        System.out.print(value + " | ");
                    }
                    index++;
                }
                System.out.print(" ]\n");
            }


            /* [ 추가 계산 여부 확인 영역 ] */
            System.out.println("============================");
            System.out.println("============================");
            System.out.print("더 계산하시겠습니까? y(yes) / n(no) : ");
            continueCalculation = input.next().charAt(0); // y 입력 시 계산기 재실행 , n 입력 시, 종료

            if (continueCalculation == 'n') {
                System.out.println("====== 계산기를 종료합니다 ======");
            }
        }
    }
}