package com.endlessmilkyway.basic_02;

public enum Messages {
    AVG_RESULT_MSG("평균 값 : ");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
