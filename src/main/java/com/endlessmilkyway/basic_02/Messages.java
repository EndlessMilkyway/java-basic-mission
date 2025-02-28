package com.endlessmilkyway.basic_02;

public enum Messages {
    INPUT_RECTANGLE_WIDTH("직사각형의 가로 길이 : "),
    INPUT_RECTANGLE_HEIGHT("직사각형의 세로 길이 : "),
    AVG_RESULT_MSG("평균 값 : "),
    EXTENT_RESULT_MSG("넓이 : ");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
