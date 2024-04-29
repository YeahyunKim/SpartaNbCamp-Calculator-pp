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

}
