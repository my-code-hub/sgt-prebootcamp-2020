package com.accenture.bootcamp.spring.examples.inversionofcontrol.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanExamples {

    private final ApplicationContext context;

    //autowiring via constructor
    public BeanExamples(ApplicationContext context) {
        this.context = context;
    }

    @PostConstruct
    public void showExample() {
        MySingletoneBean bean1 = context.getBean(MySingletoneBean.class);
        bean1.outputNumber();

        MySingletoneBean bean2 = context.getBean(MySingletoneBean.class);
        bean2.outputNumber();
    }
}
