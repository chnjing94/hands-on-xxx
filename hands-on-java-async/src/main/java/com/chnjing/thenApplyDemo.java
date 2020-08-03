package com.chnjing;

import java.util.concurrent.CompletableFuture;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class thenApplyDemo {

    /**
     * thenApply表示在CompletableFuture完成后，将结果作为输入传入下一个函数并执行。
     * thenApply中指定的函数是被同步执行的，因此getNow会阻塞等待结果
     */
    static void thenApplyExample() {
        CompletableFuture cf = CompletableFuture.completedFuture("message").thenApply(s -> {
            assertFalse(Thread.currentThread().isDaemon());
            return s.toUpperCase();
        });
        assertEquals("MESSAGE", cf.getNow(null));
    }

    public static void main(String[] args) {
        thenApplyExample();
    }
}
