package com.arcelik.training.atm.commands;

import com.arcelik.training.atm.AccountType;

public class TLGor extends AtmCommand {

    public TLGor() {
        super(AccountType.TL,
              ECommandType.GOR,
              "TL Hesabı görüntüle");
    }


}
