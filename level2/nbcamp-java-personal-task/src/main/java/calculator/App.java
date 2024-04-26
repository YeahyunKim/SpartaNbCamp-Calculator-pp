package calculator;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> results = new ArrayList<Double>(); //결과 값을 담을 임시 ArrayList

        Calculator calculator = new Calculator(); // calculator 객체 생성
        char continueCalculation = 'y'; // 계산기 추가 사용 여부

        while (continueCalculation == 'y') {
            System.out.println("============================");
            System.out.println("====== 계산기를 실행합니다 ======");

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = input.nextInt(); //첫 번째 숫자 값을 입력하고 num1에 저장

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = input.nextInt(); //두 번째 숫자 값을 입력하고 num1에 저장

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = input.next().charAt(0); //사칙연산 기호 값을 입력하고 operator에 저장

            try {
                results.add(calculator.calculate(num1, num2, operator));
                calculator.setResultList(results); // 에러사항이 없을 시, resultList에 결과값 저장
            } catch (Exception e) {
                System.out.println(e.getMessage()); //에러사항이 있을 시, 에러 메세지 출력
            }

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