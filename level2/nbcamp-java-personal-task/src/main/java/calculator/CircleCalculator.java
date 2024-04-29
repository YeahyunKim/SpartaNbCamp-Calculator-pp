package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator {


    // Setter 메서드
    public void setCircleAreaResultList(double result) {
        this.getCircleAreaResultList().add(result);  //
    }

    // Remove 원넓이 첫 번째 결과값 삭제
    public void removeCircleAreaResult() {
        this.getCircleAreaResultList().remove(0);
    }
}
