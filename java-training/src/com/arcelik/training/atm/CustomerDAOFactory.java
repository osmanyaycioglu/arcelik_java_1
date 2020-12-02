package com.arcelik.training.atm;


public class CustomerDAOFactory {

    public static ICustomerDAO createCustomerDAO() {
        return new StaticCustomerDAO();
    }

}
