package com.endlessmilkyway;

public enum Message {
    FIRST_DIGIT_INPUT("첫번째 숫자 : "),
    SECOND_DIGIT_INPUT("두번째 숫자 : "),
    PERSON_NAME_INPUT("이름: "),
    PERSON_AGE_INPUT("나이: ");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
