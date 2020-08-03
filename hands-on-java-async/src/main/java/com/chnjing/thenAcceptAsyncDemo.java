package com.chnjing;

import java.util.concurrent.CompletableFuture;

import static org.junit.Assert.assertTrue;

public class thenAcceptAsyncDemo {

    static void thenAcceptAsyncExample() {
        StringBuilder result = new StringBuilder();
        CompletableFuture cf = CompletableFuture.completedFuture("thenAcceptAsync message")
                .thenAcceptAsync(s -> result.append(s));
        cf.join();
        assertTrue("Result was empty", result.length() > 0);
    }

    public static void main(String[] args) {
        thenAcceptAsyncExample();
    }
}
