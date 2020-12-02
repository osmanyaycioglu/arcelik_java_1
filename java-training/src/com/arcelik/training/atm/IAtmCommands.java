package com.arcelik.training.atm;


public interface IAtmCommands {

    String getMenuText();

    void execute(CommandContext cc);
}
