package com.demo;

import com.demo.config.AnnotationProviderConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.CountDownLatch;

public class AnnotationProviderBootstrap {
    public static void main(String[] args) throws InterruptedException {
        new EmbeddedZooKeeper(2181, false).start();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationProviderConfiguration.class);

        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();

    }
}
