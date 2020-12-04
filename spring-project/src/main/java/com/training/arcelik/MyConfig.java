package com.training.arcelik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

import a.b.c.LibConfig;

@Configuration
@Import(LibConfig.class)
public class MyConfig {

    @Autowired
    private Environment env;

    @Value("${execute.type}")
    private Integer     exeType;

    @Bean
    @Qualifier("veli")
    public CustomerManager createCustomerManager() {
        return new CustomerManager();
    }

    @Bean
    public IExecute executeBean() {
        // int parseIntLoc = Integer.parseInt(this.env.getProperty("execute.type"));
        switch (this.exeType) {
            case 1:
                return new ExecuteImpl1();
            case 2:
                return new ExecuteImpl2();
            case 3:
                return new ExecuteImpl3();
            default:
                return new ExecuteImpl1();
        }
    }
}

