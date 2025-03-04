package com.endlessmilkyway.basic_02.view;

import com.endlessmilkyway.basic_02.Messages;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class InputView {

    private static final int FIRST_IDX = 0;
    private static final int DEFINED_ARRAY_LENGTH = 5;

    private List<Integer> processTwoDigitsFromConsole(Messages msg1, Messages msg2) {
        List<Integer> inputs = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(msg1.getMessage());
            inputs.add(Integer.parseInt(br.readLine()));
            System.out.print(msg2.getMessage());
            inputs.add(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            throw new IllegalArgumentException("입력이 잘못되었습니다!");
        }

        return inputs;
    }

    public List<Integer> getTwoDigitsFromConsole() {
        return processTwoDigitsFromConsole(Messages.INPUT_FIRST_DIGIT, Messages.INPUT_SECOND_DIGIT);
    }

    public List<Integer> getRectangleMeasurementFromConsole() {
        return processTwoDigitsFromConsole(Messages.INPUT_RECTANGLE_WIDTH, Messages.INPUT_RECTANGLE_HEIGHT);
    }

    public int[] getFiveDigitsFromConsole() {
        int[] inputs = new int[DEFINED_ARRAY_LENGTH];
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(Messages.INPUT_FIVE_DIGIT.getMessage());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = FIRST_IDX; i < DEFINED_ARRAY_LENGTH; i++) {
                inputs[i] = Integer.parseInt(st.nextToken());
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("입력이 잘못되었습니다!");
        }

        return inputs;
    }

    public int getSingleDigitFromConsole() {
        int input;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(Messages.INPUT_NUMBER.getMessage());
            input = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new IllegalArgumentException("입력이 잘못되었습니다!");
        }

        return input;
    }
}
