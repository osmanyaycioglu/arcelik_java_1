package com.arcelik.training.atm.commands;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import com.arcelik.training.atm.Account;
import com.arcelik.training.atm.AccountType;
import com.arcelik.training.atm.CommandContext;
import com.arcelik.training.atm.Customer;
import com.arcelik.training.atm.IAtmCommands;

public abstract class AtmCommand implements IAtmCommands {

    private final AccountType  at;
    private final ECommandType ct;
    private final String       menuText;

    public AtmCommand(final AccountType atParam,
                      final ECommandType ctParam,
                      final String menuTextParam) {
        super();
        this.at = atParam;
        this.ct = ctParam;
        this.menuText = menuTextParam;
    }


    @Override
    public String getMenuText() {
        return this.menuText;
    }


    public Account getAccount(final Customer customer) {
        List<Account> accountListLoc = customer.getAccountList();
        for (Account accountLoc : accountListLoc) {
            if (accountLoc.getAccountType() == this.at) {
                return accountLoc;
            }
        }
        return null;
    }

    @Override
    public void execute(final CommandContext ccParam) {
        Scanner scannerLoc = ccParam.getScanner();
        Account accountLoc = this.getAccount(ccParam.getCustomer());
        if (accountLoc == null) {
            System.out.println("Böyle bir hesap yok");
        }
        switch (this.ct) {
            case CEK: {
                System.out.println("Çekeceğiniz miktar (" + this.at + ") :");
                double nextDoubleLoc = scannerLoc.nextDouble();
                BigDecimal bigDecimalLoc = new BigDecimal(nextDoubleLoc);
                BigDecimal amountLoc = accountLoc.getAmount();
                BigDecimal subtractLoc = amountLoc.subtract(bigDecimalLoc);
                accountLoc.setAmount(subtractLoc);
                break;
            }
            case YATIR: {
                System.out.println("Yatıracağınız miktar (" + this.at + ") :");
                double nextDoubleLoc = scannerLoc.nextDouble();
                BigDecimal bigDecimalLoc = new BigDecimal(nextDoubleLoc);
                BigDecimal amountLoc = accountLoc.getAmount();
                BigDecimal addLoc = amountLoc.add(bigDecimalLoc);
                accountLoc.setAmount(addLoc);
                break;
            }
            default:
                break;
        }
        System.out.println(this.at + " Hesabınızda " + accountLoc.getAmount() + this.at.getText() + " var");
    }


}
