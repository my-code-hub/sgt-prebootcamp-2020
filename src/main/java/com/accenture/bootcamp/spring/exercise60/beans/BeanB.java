package com.accenture.bootcamp.spring.exercise60.beans;

import org.springframework.stereotype.Component;

//BeanB (has dependency BeanA)
@Component
public class BeanB {

    private final BeanA beanA;

    public BeanB(BeanA beanA) {
        this.beanA = beanA;
    }
}
