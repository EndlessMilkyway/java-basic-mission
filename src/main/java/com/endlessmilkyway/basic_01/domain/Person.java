package com.endlessmilkyway.basic_01.domain;

public record Person(String name, int age) {
    @Override
    public String toString() {
        return "이름 : " + name + "\n"
                + "나이 : " + age;
    }
}
