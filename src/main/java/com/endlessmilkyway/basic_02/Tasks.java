package com.endlessmilkyway.basic_02;

import com.endlessmilkyway.basic_02.view.InputView;
import com.endlessmilkyway.basic_02.view.OutputView;
import java.util.List;

public class Tasks {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final ArrayManager arrayManager = new ArrayManager();

    // 태스크1. 배열의 평균을 계산하고 배열 요소를 변경하는 메서드 작성하기
    // 입력 : 없음
    // 출력 : 배열에 저장된 숫자의 평균, 요소 변경이 반영된 배열
    public void task1() {
        int[] randArray = arrayManager.createRandArray();
        outputView.printArrayElems(randArray);

        outputView.printAvgVal(arrayManager.calcAvgFromValues(randArray));

        arrayManager.changeArrayElement(randArray, 10, 9999);
        outputView.printArrayElems(randArray);
    }

    // 태스크2. 사용자로부터 직사각형의 가로와 세로를 입력받아 넓이 출력하기
    // 입력 : 직사각형의 가로 길이, 직사각형의 세로 길이 (2개)
    // 출력 : 직사각형의 넓이
    public void task2() {
        List<Integer> inputs = inputView.getRectangleMeasurementFromConsole();
        outputView.printExtent(inputs.get(0) * inputs.get(1));
    }

    // 태스크3. 두 개의 정수를 더하고 빼는 메서드 작성하기
    // 입력 : 정수 2개
    // 출력 : 2개의 정수를 더한 결과, 2개의 정수를 뺀 결과
    public void task3() {
        List<Integer> inputs = inputView.getTwoDigitsFromConsole();
        Calculator calculator = new Calculator();
        int added = calculator.add(inputs.get(0), inputs.get(1));
        int subtracted = calculator.subtract(inputs.get(0), inputs.get(1));

        outputView.printBasicOperationsResult(added, subtracted);
    }

    // 태스크4. 5개의 정수 오름차순 정렬하기
    // 입력 : 5개의 정수
    // 출력 : 정렬된 결과
    public void task4() {

    }

    // 태스크5. 1부터 10까지의 숫자 배열 출력하기
    // 입력 : 없음
    // 출력 : 1부터 10까지 총 10개의 숫자가 저장된 배열
    public void task5() {

    }

    // 태스크6. 홀수/짝수 판별 프로그램 작성하기
    // 입력 : 정수 1개
    // 출력 : 판별 결과
    public void task6() {

    }
}
