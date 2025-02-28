package com.endlessmilkyway.basic_02.view;

import com.endlessmilkyway.basic_02.Messages;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputView {

    public List<Integer> processTwoDigitsFromConsole(Messages msg1, Messages msg2) {
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
}
