package com.chnjing;

import java.util.concurrent.CompletableFuture;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class runAsyncDemo {

    /**
     * 异步运行一个任务：睡眠1S，主线程在不同时间去查看任务是否结束。
     * 异步任务的执行在没有指定executor的情况下，通过ForkJoinPool实现， 它使用守护线程去执行任务。
     */
    static void runAsyncDemo() {
        CompletableFuture cf = CompletableFuture.runAsync(() -> {
            assertTrue(Thread.currentThread().isDaemon());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        assertFalse(cf.isDone());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(cf.isDone());
    }


    public static void main(String[] args) {
        runAsyncDemo();
    }
}
