package com.chnjing;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class acceptEitherDemo {

    /**
     * 同applyToEither
     */
    static void acceptEitherExample() {
        String original = "Message";
        StringBuilder result = new StringBuilder();
        CompletableFuture cf = CompletableFuture.completedFuture(original)
                .thenApplyAsync(String::toUpperCase, CompletableFuture.delayedExecutor(1, TimeUnit.SECONDS))
                .acceptEither(CompletableFuture.completedFuture(original).thenApplyAsync(String::toLowerCase, CompletableFuture.delayedExecutor(1, TimeUnit.SECONDS)),
                        s -> result.append(s).append("acceptEither"));
        cf.join();
        assertTrue("Result was empty", result.toString().endsWith("acceptEither"));
    }

    public static void main(String[] args) {
        acceptEitherExample();
    }
}
