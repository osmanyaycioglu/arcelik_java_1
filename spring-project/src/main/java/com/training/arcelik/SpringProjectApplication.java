package com.training.arcelik;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import a.b.c.ExtraBean;

//@SpringBootApplication(scanBasePackages = {
//                                            "com.training.arcelik",
//                                            "a.b.c"
//})
@SpringBootApplication
@ServletComponentScan
public class SpringProjectApplication {

    @Autowired
    private CustomerManager customerManager;

    @Autowired
    private IExecute        exe;

    @Autowired
    private ExtraBean       eb;

    private final ExtraBean ebX;

    private ExtraBean       ebX2;

    @Autowired
    public SpringProjectApplication(final ExtraBean ebX) {
        this.ebX = ebX;
        ebX.deneme();
    }

    @Autowired
    public void methodWireX(final ExtraBean ebX2) {
        this.ebX2 = ebX2;
    }

    @PostConstruct
    public void start() {
        this.eb.deneme();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("öldü");
    }

    public void init() {
        String customerUIDLoc = this.customerManager.getCustomerUID();
        System.out.println(customerUIDLoc);
        this.exe.exec("osman");
        this.eb.deneme();
    }

}
