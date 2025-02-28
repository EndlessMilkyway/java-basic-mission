package com.endlessmilkyway.basic_01.view;

import com.endlessmilkyway.basic_01.Messages;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputView {
    private List<String> getInputFromConsole(Messages firstMsg, Messages secondMsg) {
        List<String> inputs = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(firstMsg.getMessage());
            inputs.add(br.readLine());
            System.out.print(secondMsg.getMessage());
            inputs.add(br.readLine());
        } catch (IOException e) {
            throw new IllegalArgumentException("입력이 잘못되었습니다!");
        }

        return inputs;
    }

    public List<Integer> getDigitsFromConsole() {
        return getInputFromConsole(Messages.FIRST_DIGIT_INPUT, Messages.SECOND_DIGIT_INPUT).stream()
                .map(Integer::parseInt)
                .toList();
    }

    public List<String> getPersonInfoFromConsole() {
        return getInputFromConsole(Messages.PERSON_NAME_INPUT, Messages.PERSON_AGE_INPUT);
    }
}
