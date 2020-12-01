package com.arcelik.training.java.pattern.command;

import java.util.ArrayList;
import java.util.List;

import com.arcelik.training.java.pattern.command.commands.AddCommand;
import com.arcelik.training.java.pattern.command.commands.MultCommand;
import com.arcelik.training.java.pattern.command.commands.SubsCommand;

public class CalculatorCommandFactory {

    private final List<ICalculatorCommand> calcList = new ArrayList<>();

    void init() {
        this.calcList.add(new AddCommand());
        this.calcList.add(new SubsCommand());
        this.calcList.add(new MultCommand());
    }

    public void showMenu() {
        int index = 1;
        for (ICalculatorCommand cc : this.calcList) {
            System.out.println(index + "-" + cc.menuItem());
            index++;
        }
    }

    public ICalculatorCommand getCommand(final int indexParam) {
        return this.calcList.get(indexParam - 1);
    }

}
