package com.lzx.thread;

public class Thread01 extends Thread{
    private int count = 0;

    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName()+"我是子线程");


        try{
            synchronized (this){
                for (int i = 0; i < 100; i++) {

                    System.out.println(Thread.currentThread().getName()+"我是子线程"+i);

                }
//                join();
            }

//            Thread.sleep(3000);

        }catch (Exception e){
            e.printStackTrace();

        }
        System.out.println("子线程执行完毕");
    }

    public static void main(String[] args) {
        //1.启动的方法不是启动run方法而是启动start方法
        //2。调用start方法不是立即被cpu调度，也就是就绪状态，，而是等待时间片。线程从就绪到运行状态
//        System.out.println(Thread.currentThread().getName()+"我是主线程");
        new Thread01().start();
        new Thread01().start();
        new Thread01().start();
//        new Thread01().start();

//        System.out.println("主线程执行完毕！！！！");
    }
}
