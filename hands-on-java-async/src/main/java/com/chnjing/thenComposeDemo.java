package com.chnjing;

import java.util.concurrent.CompletableFuture;

import static org.junit.Assert.assertEquals;

public class thenComposeDemo {

    /**
     * thenCompose这个方法等待第一个阶段的完成(大写转换)， 它的结果传给一个指定的返回CompletableFuture函数
     */
    static void thenComposeExample() {
        String original = "Message";
        CompletableFuture cf = CompletableFuture.completedFuture(original).thenApply(String::toUpperCase)
                .thenCompose(upper -> CompletableFuture.completedFuture(original).thenApply(String::toLowerCase)
                        .thenApply(s -> upper + s));
        assertEquals("MESSAGEmessage", cf.join());
    }

    public static void main(String[] args) {

    }
}
