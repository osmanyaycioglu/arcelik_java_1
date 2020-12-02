package com.arcelik.training.atm;

import java.util.ArrayList;
import java.util.List;

import com.arcelik.training.atm.commands.DOLARGor;
import com.arcelik.training.atm.commands.DOLARParaCek;
import com.arcelik.training.atm.commands.DOLARParaYatir;
import com.arcelik.training.atm.commands.TLGor;
import com.arcelik.training.atm.commands.TLParaCek;
import com.arcelik.training.atm.commands.TLParaYatir;

public class AtmCommandFactory {

    public static List<IAtmCommands> getCommands() {
        List<IAtmCommands> commandsLoc = new ArrayList<>();
        commandsLoc.add(new TLParaYatir());
        commandsLoc.add(new TLParaCek());
        commandsLoc.add(new TLGor());
        commandsLoc.add(new DOLARParaYatir());
        commandsLoc.add(new DOLARParaCek());
        commandsLoc.add(new DOLARGor());

        return commandsLoc;

    }

}
