package com.demo;

import com.demo.api.EchoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EchoXMLConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/echo-consumer.xml");
        context.start();
        EchoService demoService = context.getBean("demoService", EchoService.class);
        String status = demoService.echo("Hello CJ!");
        System.out.println("echo result: " + status);
    }
}
