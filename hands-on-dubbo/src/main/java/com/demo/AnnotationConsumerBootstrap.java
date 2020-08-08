package com.demo;

import com.demo.action.AnnotationAction;
import com.demo.config.AnnotationConsumerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConsumerBootstrap {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConsumerConfiguration.class);

        context.start();

        AnnotationAction consumer = context.getBean(AnnotationAction.class);

        String hello = consumer.echo("Hello World!");
        System.out.println("result: " + hello);
    }
}
