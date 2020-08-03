package com.chnjing;

import java.util.concurrent.CompletableFuture;

import static org.junit.Assert.*;

public class thenApplyAsyncDemo {

    /**
     * thenApplyAsync中指定的函数将被异步执行，因此getNow不会阻塞等待，会返回null。调用join方法才会阻塞等待结果。
     */
    static void thenApplyAsyncExample() {
        CompletableFuture cf = CompletableFuture.completedFuture("message").thenApplyAsync(s -> {
            assertTrue(Thread.currentThread().isDaemon());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return s.toUpperCase();
        });
        assertNull(cf.getNow(null));
        assertEquals("MESSAGE", cf.join());
    }

    public static void main(String[] args) {
        thenApplyAsyncExample();
    }
}
