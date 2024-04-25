package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = input.nextInt(); //첫 번째 숫자 값을 입력하고 num1에 저장

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = input.nextInt(); //두 번째 숫자 값을 입력하고 num1에 저장

        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = input.next().charAt(0); //사칙연산 기호 값을 입력하고 operator에 저장
    }
}
