package com.arcelik.training.atm;

import java.math.BigDecimal;

public class Account {

    private BigDecimal  amount;
    private AccountType accountType;

    public Account() {

    }

    public Account(final AccountType accountType,
                   final BigDecimal amountParam) {
        super();
        this.accountType = accountType;
        this.amount = amountParam;
    }


    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(final BigDecimal amountParam) {
        this.amount = amountParam;
    }

    @Override
    public String toString() {
        return "Account [type=" + this.accountType + ", amount=" + this.amount + "]";
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public void setAccountType(final AccountType accountTypeParam) {
        this.accountType = accountTypeParam;
    }

}
