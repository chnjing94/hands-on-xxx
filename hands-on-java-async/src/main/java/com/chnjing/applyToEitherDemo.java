package com.chnjing;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class applyToEitherDemo {

    /**
     * 两个CompletionStage，谁执行返回的结果快，就用那个CompletionStage的结果进行下一步的转化操作。
     * 下面code中，cf1和cf2谁的返回结果快，就作为输入调用applyToEither的第二个参数。
     */
    static void applyToEitherExample() {
        String original = "Message";
        CompletableFuture cf1 = CompletableFuture.completedFuture(original)
                .thenApplyAsync(String::toUpperCase, CompletableFuture.delayedExecutor(1, TimeUnit.SECONDS));

        CompletableFuture cf2 = cf1.applyToEither(
                CompletableFuture.completedFuture(original).thenApplyAsync(String::toLowerCase, CompletableFuture.delayedExecutor(1, TimeUnit.SECONDS)),
                s -> s + " from applyToEither");
        String result = cf2.join().toString();
        System.out.println(result);
        assertTrue(result.endsWith(" from applyToEither"));
    }

    public static void main(String[] args) {
        applyToEitherExample();
    }
}
