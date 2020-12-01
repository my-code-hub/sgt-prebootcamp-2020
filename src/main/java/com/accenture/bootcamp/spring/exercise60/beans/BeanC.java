package com.accenture.bootcamp.spring.exercise60.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// BeanC (has dependency BeanA and BeanB)
@Component
public class BeanC {

    private final BeanA beanA;
    private final BeanB beanB;

    public BeanC(BeanA beanA, BeanB beanB) {
        this.beanA = beanA;
        this.beanB = beanB;
    }

    @PostConstruct
    public void sayHello() {
        System.out.println("Boom, all beans defined!");
    }
}
