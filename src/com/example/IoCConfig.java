package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example")
@PropertySource("classpath:com/example/value.properties")

public class IoCConfig {
    @Bean
    public ICustomerDal MsSqlDatabase(){
        return new CustomerDalMsSql();
    }
    @Bean
    public ICustomerDal OracleDatabase(){
        return new CustomerDalOracle();
    }
    @Bean
    public ICustomerDal MySqlDatabase(){
        return new CustomerDalMySql();
    }

    @Bean
    public ICustomerService service(){
        return new CustomerManager(MySqlDatabase());
    }
}
