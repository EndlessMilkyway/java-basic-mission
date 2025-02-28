package com.endlessmilkyway.basic_02.view;

import com.endlessmilkyway.basic_02.Messages;
import java.util.Arrays;

public class OutputView {

    public void printArrayElems(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public void printAvgVal(int avgVal) {
        System.out.println(Messages.AVG_RESULT_MSG.getMessage() + avgVal);
    }
}
