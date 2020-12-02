package com.arcelik.training.atm.commands;

import com.arcelik.training.atm.AccountType;

public class TLParaYatir extends AtmCommand {

    public TLParaYatir() {
        super(AccountType.TL,
              ECommandType.YATIR,
              "TL Yatır");
    }


}
