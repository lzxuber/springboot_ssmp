package com.lzx.thread;

import lombok.SneakyThrows;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test03 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
        executorService1.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+"我是子线程"+i);
                }
            }
        });

    }
}
