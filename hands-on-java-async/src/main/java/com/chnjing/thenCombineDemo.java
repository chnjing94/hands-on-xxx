package com.chnjing;

import java.util.concurrent.CompletableFuture;

import static org.junit.Assert.assertEquals;

public class thenCombineDemo {

    static void thenCombineExample() {
        String original = "Message";
        CompletableFuture cf = CompletableFuture.completedFuture(original).thenApply(String::toUpperCase)
                .thenCombine(CompletableFuture.completedFuture(original).thenApply(String::toLowerCase),
                        (s1, s2) -> s1 + s2);
        assertEquals("MESSAGEmessage", cf.getNow(null));
    }

    public static void main(String[] args) {
        thenCombineExample();
    }
}
