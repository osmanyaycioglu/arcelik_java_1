package com.arcelik.training.atm.commands;

import com.arcelik.training.atm.AccountType;

public class DOLARParaCek extends AtmCommand {

    public DOLARParaCek() {
        super(AccountType.DOLAR,
              ECommandType.CEK,
              "Dolar Çek");
    }


}
