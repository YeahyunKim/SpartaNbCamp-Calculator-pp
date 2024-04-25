package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
            System.out.println("============================");
            System.out.print("더 계산하시겠습니까? y(yes) / n(no) : ");
            continueCalculation = input.next().charAt(0); // y 입력 시 계산기 재실행 , n 입력 시, 종료

            if (continueCalculation == 'n') {
                System.out.println("====== 계산기를 종료합니다 ======");
            }

        }
    }
}
