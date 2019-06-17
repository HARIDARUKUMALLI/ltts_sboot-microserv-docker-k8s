package com.examples.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CustomerConfiguration 
{
    @Bean
    public Customer customer() {
        return new Customer(person());
    }
    
    @Bean
    public Person person() {
        return new Person("Jack",50,"New York");
    }
}
