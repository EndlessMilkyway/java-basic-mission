package com.endlessmilkyway.basic_01;

import com.endlessmilkyway.basic_01.domain.Person;
import com.endlessmilkyway.basic_01.view.InputView;
import com.endlessmilkyway.basic_01.view.OutputView;
import java.util.List;

public class Tasks {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final Calculator calculator = new Calculator();

    public void task1() {
        List<Integer> inputs = inputView.getDigitsFromConsole();
        int result = calculator.compare(inputs.get(0), inputs.get(1));
        outputView.printResult(String.valueOf(result));
    }

    public void task2() {
        List<Integer> inputs = inputView.getDigitsFromConsole();
        int result = calculator.sum(inputs.get(0), inputs.get(1));
        outputView.printResult(String.valueOf(result));
    }

    public void task3() {
        List<String> inputs = inputView.getPersonInfoFromConsole();
        Person person = new Person(inputs.get(0), Integer.parseInt(inputs.get(1)));
        outputView.printResult(person.toString());
    }
}
