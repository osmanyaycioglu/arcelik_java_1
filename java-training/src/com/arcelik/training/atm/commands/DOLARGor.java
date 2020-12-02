package com.arcelik.training.atm.commands;

import com.arcelik.training.atm.AccountType;

public class DOLARGor extends AtmCommand {

    public DOLARGor() {
        super(AccountType.DOLAR,
              ECommandType.GOR,
              "Dolar Hesabı görüntüle");
    }


}
