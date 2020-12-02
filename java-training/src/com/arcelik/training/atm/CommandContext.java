package com.arcelik.training.atm;

import java.util.Scanner;

public class CommandContext {

    private Scanner  scanner;
    private Customer customer;

    public Scanner getScanner() {
        return this.scanner;
    }

    public void setScanner(final Scanner scannerParam) {
        this.scanner = scannerParam;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(final Customer customerParam) {
        this.customer = customerParam;
    }


}
