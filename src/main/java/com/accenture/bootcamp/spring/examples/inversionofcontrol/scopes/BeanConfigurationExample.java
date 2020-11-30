package com.accenture.bootcamp.spring.examples.inversionofcontrol.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Configuration
public class BeanConfigurationExample {

   // @Scope(SCOPE_PROTOTYPE)
    @Bean
    public MySingletoneBean mySingletoneBean() {
        return new MySingletoneBean();
    }
}
