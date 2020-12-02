package com.arcelik.training.atm.commands;

import com.arcelik.training.atm.AccountType;

public class DOLARParaYatir extends AtmCommand {

    public DOLARParaYatir() {
        super(AccountType.DOLAR,
              ECommandType.YATIR,
              "Dolar Yatır");
    }


}
