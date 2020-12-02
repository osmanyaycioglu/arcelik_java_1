package com.arcelik.training.atm.commands;

import com.arcelik.training.atm.AccountType;

public class TLParaCek extends AtmCommand {

    public TLParaCek() {
        super(AccountType.TL,
              ECommandType.CEK,
              "TL Çek");
    }


}
