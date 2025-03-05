package com.endlessmilkyway.basic_02.utils;

public class Calculator {

    private static Calculator calculator;

    private Calculator() {
    }

    public static Calculator getInstance() {
        if (calculator == null) {
            return new Calculator();
        }
        return calculator;
    }

    private static final int EVEN_DETECT_NUM = 2;
    private static final int REMAIN_NUM_FOR_EVEN = 0;

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public String inspectEvenAndOdd(int num) {
        if (num % EVEN_DETECT_NUM != REMAIN_NUM_FOR_EVEN) {
            return "홀수";
        }

        return "짝수";
    }
}
