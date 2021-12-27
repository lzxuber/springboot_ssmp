package com.lzx.thread;

public class Thread02 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"我是子线程");
    }
    //实现Runnable 比继承类用法多，实现的是函数编程
    public static void main(String[] args) {
        //启动线程
//        new Thread(new Thread02()).start();

        //使用匿名内部类的形式创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"我是子线程");
        }).start();
    }



}
