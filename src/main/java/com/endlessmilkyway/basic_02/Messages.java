package com.endlessmilkyway.basic_02;

public enum Messages {
    INPUT_RECTANGLE_WIDTH("직사각형의 가로 길이 : "),
    INPUT_RECTANGLE_HEIGHT("직사각형의 세로 길이 : "),
    INPUT_FIRST_DIGIT("첫 번째 정수 : "),
    INPUT_SECOND_DIGIT("두 번째 정수 : "),
    AVG_RESULT("평균 값 : "),
    EXTENT_RESULT("넓이 : "),
    ADD_RESULT("덧셈 결과 : "),
    SUBTRACT_RESULT("뺄셈 결과 : ");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
