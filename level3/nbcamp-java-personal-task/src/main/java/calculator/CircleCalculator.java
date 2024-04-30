package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator {

    // Setter 메서드
    public void setCircleAreaResultList(double result) {
        this.getResultList().add(result);  //
    }

    // Remove 원넓이 첫 번째 결과값 삭제
    public void removeCircleAreaResult() {
        this.getResultList().remove(0);
    }

    // 원의 넓이 구하기
    public double calculateCircleArea(int circleRadius) {
        return circleRadius * circleRadius * PI;
    }
}
