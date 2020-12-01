package com.arcelik.training.java.pattern.command;


public interface ICalculatorCommand {

    String menuItem();

    int execute(CommandContext cc);

}
