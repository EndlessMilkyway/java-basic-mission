package com.endlessmilkyway.basic_02.view;

import com.endlessmilkyway.basic_02.Messages;
import java.util.Arrays;

public class OutputView {

    public void printArrayElems(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public void printAvgVal(int avgVal) {
        System.out.println(Messages.AVG_RESULT.getMessage() + avgVal);
    }

    public void printExtent(int extent) {
        System.out.println(Messages.EXTENT_RESULT.getMessage() + extent);
    }

    public void printBasicOperationsResult(int added, int subtracted) {
        System.out.println("덧셈 결과 : " + added);
        System.out.println("뺄셈 결과 : " + subtracted);
    }

    public void printEvenOrOdd(String result) {
        System.out.printf("해당 숫자는 %s 입니다.", result);
    }
}
