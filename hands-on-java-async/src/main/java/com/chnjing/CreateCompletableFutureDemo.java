package com.chnjing;

import java.util.concurrent.CompletableFuture;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CreateCompletableFutureDemo {

    /**
     * 创建一个已经完成的CompletableFuture，验证它isDone，并且返回值是"message"
     */
    static void completedFutureExample() {
        CompletableFuture cf = CompletableFuture.completedFuture("message");
        assertTrue(cf.isDone());

        // 如果CompletableFuture已经有结果，getNow函数返回该结果，否则返回传入参数。
        assertEquals("message", cf.getNow(null));
    }

    public static void main(String[] args) {
        completedFutureExample();
    }
}
