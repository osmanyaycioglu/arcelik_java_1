package com.arcelik.training.atm;

import java.util.List;
import java.util.Scanner;

public class ATMRun {

    public static void main(final String[] args) {
        CustomerManager customerManagerLoc = new CustomerManager();
        customerManagerLoc.init();

        Atm atmLoc = new Atm();


        try (Scanner scannerLoc = new Scanner(System.in)) {
            System.out.println("Username : ");
            String username = scannerLoc.nextLine();
            System.out.println("Password : ");
            String password = scannerLoc.nextLine();
            Customer customerLoc = customerManagerLoc.login(username,
                                                            password);

            if (customerLoc != null) {
                while (true) {
                    System.out.println("Merhaba " + customerLoc.getName() + " " + customerLoc.getSurname());
                    System.out.println("Hesaplarınız");
                    List<Account> accountListLoc = customerLoc.getAccountList();
                    for (Account accountLoc : accountListLoc) {
                        System.out.println(accountLoc);
                    }
                    atmLoc.showMenu();
                    System.out.println("Seçiminiz : ");
                    int nextIntLoc = scannerLoc.nextInt();
                    atmLoc.executeCommand(nextIntLoc,
                                          customerLoc,
                                          scannerLoc);
                }

            } else {
                System.out.println("Böyle bir user yok");
            }

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }

    }
}
