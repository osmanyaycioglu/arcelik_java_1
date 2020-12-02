package com.arcelik.training.atm;

import java.util.List;
import java.util.Scanner;

public class Atm {

    List<IAtmCommands> commandsLoc = AtmCommandFactory.getCommands();

    public void showMenu() {
        int index = 1;
        for (IAtmCommands iAtmCommandsLoc : this.commandsLoc) {
            System.out.println(index + "-" + iAtmCommandsLoc.getMenuText());
            index++;
        }
    }

    public void executeCommand(final int index,
                               final Customer customer,
                               final Scanner scanner) {
        try {
            IAtmCommands iAtmCommandsLoc = this.commandsLoc.get(index - 1);
            if (iAtmCommandsLoc != null) {
                CommandContext contextLoc = new CommandContext();
                contextLoc.setCustomer(customer);
                contextLoc.setScanner(scanner);
                iAtmCommandsLoc.execute(contextLoc);
            }

        } catch (Exception eLoc) {
            System.exit(1);
        }
    }

}
