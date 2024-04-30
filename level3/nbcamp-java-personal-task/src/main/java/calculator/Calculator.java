package calculator;

import java.util.ArrayList;

public abstract class Calculator {
    private ArrayList<Double> resultList;
    private ArrayList<Double> circleAreaResultList; //[314,]


    public static final double PI = 3.14; // PI는 변하지않는 상수로 활용해야 하기 때문에 static final를 사용

    // 생성자
    public Calculator() {
        this.resultList = new ArrayList<>();
    }

    // Getter 메서드
    public ArrayList<Double> getResultList() {
        return this.resultList;
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

}
