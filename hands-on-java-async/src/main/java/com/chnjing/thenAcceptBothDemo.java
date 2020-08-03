package com.chnjing;

import java.util.concurrent.CompletableFuture;

import static org.junit.Assert.assertEquals;

public class thenAcceptBothDemo {

    /**
     * 使用BiConsumer处理两个阶段的结果
     */
    static void thenAcceptBothExample() {
        String original = "Message";
        StringBuilder result = new StringBuilder();
        CompletableFuture.completedFuture(original).thenApply(String::toUpperCase).thenAcceptBoth(
                CompletableFuture.completedFuture(original).thenApply(String::toLowerCase),
                (s1, s2) -> result.append(s1 + s2));
        assertEquals("MESSAGEmessage", result.toString());
    }

    public static void main(String[] args) {
        thenAcceptBothExample();
    }
}
