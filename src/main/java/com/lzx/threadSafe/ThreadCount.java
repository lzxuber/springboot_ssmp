package com.lzx.threadSafe;

public class ThreadCount implements Runnable{

    private static int count = 100;

    private Object objectLock = new Object();

    /**...想象线程同时执行
     * 保证线程一直在运行状态，放在循环当中
     *
     * 什么时候才会发生线程安全问题。多个线程同时访问一个变量，对这个变量进行修改的操作（也就是写操作）
     */
    @Override
//    public synchronized  void run() {
    public  void run() {
        while(true){
                try{
                    Thread.sleep(30);
                }catch (Exception e){
                    e.printStackTrace();
                }
              /*  synchronized (this){
                    count--;
                    System.out.println(Thread.currentThread().getName()+","+count);
                }*/
                cal();
        }

    }

    /**
     *1.将synchronized 加载我们实例方法上，则使用的是this锁
     *2.将synchronized 加载我们静态方法上，当前的类名称.class
     */
    public static  void cal(){
        synchronized(ThreadCount.class){
            if(count>1){
                count--;
                System.out.println(Thread.currentThread().getName()+","+count);
            }
        }

    }


  /*  public synchronized void cal(){
        if(count>1){
                count--;
                System.out.println(Thread.currentThread().getName()+","+count);
        }
    }*/

 /*   public  void cal2(){
        synchronized(this){
            if(count>1){
                count--;
                System.out.println(Thread.currentThread().getName()+","+count);
            }
        }
    }*/


    public static void main(String[] args) {
        ThreadCount threadCount = new ThreadCount();
//        ThreadCount threadCount2 = new ThreadCount();
        new Thread(threadCount).start();
        new Thread(threadCount).start();
//        new Thread(threadCount2).start();


    }
}
