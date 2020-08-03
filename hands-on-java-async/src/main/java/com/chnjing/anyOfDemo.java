package com.chnjing;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class anyOfDemo {

    /**
     * 当任意一个CompletableFuture完成后， 创建一个完成的CompletableFuture.
     */
    static void anyOfExample() {
        StringBuilder result = new StringBuilder();
        List<String> messages = Arrays.asList("a", "b", "c");
        List<CompletableFuture> futures = messages.stream()
                .map(msg -> CompletableFuture.completedFuture(msg).thenApply(String::toUpperCase))
                .collect(Collectors.toList());
        CompletableFuture.anyOf(futures.toArray(new CompletableFuture[futures.size()])).whenComplete((res, th) -> {
            if(th == null) {
                result.append(res);
            }
        });
        assertTrue("Result was empty", result.length() > 0);
    }

    public static void main(String[] args) {
        anyOfExample();
    }
}
