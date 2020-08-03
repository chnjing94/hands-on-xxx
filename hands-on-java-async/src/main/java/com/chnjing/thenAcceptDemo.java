package com.chnjing;

import java.util.concurrent.CompletableFuture;

import static org.junit.Assert.assertTrue;

public class thenAcceptDemo {

    /**
     * thenAccept接受一个consumer, 没有返回结果。
     */
    static void thenAcceptExample() {
        StringBuilder result = new StringBuilder();
        CompletableFuture.completedFuture("thenAccept message")
                .thenAccept(s -> result.append(s));
        assertTrue("Result was empty", result.length() > 0);
    }

    public static void main(String[] args) {
        thenAcceptExample();
    }
}
