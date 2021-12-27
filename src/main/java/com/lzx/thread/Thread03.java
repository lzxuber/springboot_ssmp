package com.lzx.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Thread03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadCallable threadCallable = new ThreadCallable();
        FutureTask<Integer> integerFutureTask = new FutureTask<Integer>(threadCallable);
        new Thread(integerFutureTask).start();
        //我的主线程需要等待我们子线程给我们返回结果，所以，callable 又变成了串行，可以理解为异步变同步。
        //主线程阻塞等待子线程返回结果
        Integer result = integerFutureTask.get();
        System.out.println(Thread.currentThread().getName()+","+result);
    }
}
