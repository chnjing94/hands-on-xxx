package com.demo.webfluxws;

import com.demo.webfluxws.entity.WebSocketSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class ScheduledTask {
    @Autowired
    public ConcurrentHashMap<String, Set<WebSocketSender>> queueSubscriber;

    private AtomicInteger head;
    private AtomicInteger tail;

    @PostConstruct
    private void init() {
        head = new AtomicInteger();
        tail = new AtomicInteger();
    }

    @Scheduled(fixedRate = 5000)
    public void updateQueuesStatus() {
        int headIncre = new Random().nextInt(100);
        int tailIncre = headIncre + new Random().nextInt(10);
        head.addAndGet(headIncre);
        tail.addAndGet(tailIncre);

        Set<WebSocketSender> subscribers = queueSubscriber.get("testqueue");

        System.out.println("testqueue's subscribers: " + subscribers.size());

        subscribers.stream()
                .parallel()
                .forEach(webSocketSender -> {
                    if (webSocketSender.isClosed()) {
                        subscribers.remove(webSocketSender);
                    } else {
                        webSocketSender.send(String.format("{head: %d, tail: %d}", head.get(), tail.get()));
                    }
                });
    }
}

