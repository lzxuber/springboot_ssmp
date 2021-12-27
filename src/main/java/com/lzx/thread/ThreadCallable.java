package com.lzx.thread;

import java.util.concurrent.Callable;

public class ThreadCallable implements Callable<Integer> {
    //当前线程需要执行的代码 返回代码

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"开始执行……");
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();

        }
        System.out.println(Thread.currentThread().getName()+"返回1");
        return 1;
    }




}
