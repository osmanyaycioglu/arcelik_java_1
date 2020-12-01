package com.arcelik.training.java.pattern.command.commands;

import com.arcelik.training.java.pattern.command.CommandContext;
import com.arcelik.training.java.pattern.command.ICalculatorCommand;

public class SubsCommand implements ICalculatorCommand {

    @Override
    public int execute(final CommandContext ccParam) {
        return ccParam.getVal1() - ccParam.getVal2();
    }

    @Override
    public String menuItem() {
        return "Çıkarma";
    }

}
