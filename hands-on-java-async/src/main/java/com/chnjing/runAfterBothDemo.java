package com.chnjing;

import java.util.concurrent.CompletableFuture;

import static org.junit.Assert.assertTrue;

public class runAfterBothDemo {

    /**
     * runAfterBoth:
     */
    static void runAfterBothExample() {
        String original = "Message";
        StringBuilder result = new StringBuilder();
        CompletableFuture.completedFuture(original).thenApply(s -> {
            result.append(s.toUpperCase());
            return s.toUpperCase();
        }).runAfterBoth(
                CompletableFuture.completedFuture(original).thenApply(s -> {
                    result.append(s.toLowerCase());
                    return s.toLowerCase();
                }),
                () -> result.append("done"));
        System.out.println(result.toString());
        assertTrue("Result was empty", result.length() > 0);
    }

    public static void main(String[] args) {
        runAfterBothExample();
    }
}
