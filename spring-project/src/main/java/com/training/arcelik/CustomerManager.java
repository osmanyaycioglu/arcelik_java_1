package com.training.arcelik;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ali")
// @Primary
// @Scope("prototype")

//@Controller
//@Service
//@Repository
//@Configuration

public class CustomerManager {

    public String getCustomerUID() {
        return UUID.randomUUID()
                   .toString();
    }

}
