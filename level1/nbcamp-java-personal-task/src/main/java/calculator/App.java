package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //연산 결과 result 10개를 저장할 배열 생성
        double[] resultList = new double[10];

        //연산 결과 개수를 저장할 변수 생성
        int resultCount = 0;

        double result;
        char continueCalculation = 'y';

        while (continueCalculation == 'y') {
            System.out.println("====== 계산기를 실행합니다 ======");

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = input.nextInt(); //첫 번째 숫자 값을 입력하고 num1에 저장

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = input.nextInt(); //두 번째 숫자 값을 입력하고 num1에 저장

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = input.next().charAt(0); //사칙연산 기호 값을 입력하고 operator에 저장


            // operator의 값에 따라 연산 실행시키기
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
                    if (num2 != 0) {
                        result = (double)num1 / num2;
                        break;
                    } else {
                        System.out.println("나눗셈 연산에서 부모(두 번째 정수)에 0이 입력될 수 없습니다.");
                        result = 0;
                        break;
                    }

                default:
                    result = 0;
            }

            System.out.println("결과: " + result);

            // [if] 결과값 개수가 11개면
            if (resultCount == 10) {
                for (int i = 0; i < resultCount; i++) {
                    resultList[i] = resultList[i+1]; // 배열의 0번째 인덱스에 1번째 인덱스값을 대입, 각각 1씩 증가하여 전체 배열 한칸씩 이동
                }
                resultList[resultCount-1] = result; // 10번째 결과값을 resultList 배열에 추가

            // [else] 결과값 개수가 11개가 아니면
            } else {
                resultList[resultCount] = result; // 결과값을 resultList 배열에 추가

                resultCount++; // 결과 개수 1 증가
            }

            System.out.println("============================");
            System.out.print("더 계산하시겠습니까? y(yes) / n(no) : ");
            continueCalculation = input.next().charAt(0); // y 입력 시 계산기 재실행 , n 입력 시, 종료

            if (continueCalculation == 'n') {
                System.out.println("====== 계산기를 종료합니다 ======");
            }

        }
    }
}
