package com.examples.spring.core.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
class CustomerConfiguration 
{
    @Bean
    public Customer customer() {
        return new Customer(person());
    }    
    
    @Bean
    public Person person() {
        return new Person("Bill",36,"San Jose");
    }    
}
