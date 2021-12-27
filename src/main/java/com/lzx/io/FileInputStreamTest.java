package com.lzx.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {

    }

    @Test
    public  void getHello2() throws IOException {
        String filename = "E:\\hello2.txt";//一个汉字3个字节，今天开始好好学习！！！
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream  = new FileInputStream(filename);
            while( (readData = fileInputStream.read() )!= -1 ){
//                System.out.println((char)readData);
                System.out.println(readData);
                //char是单个字节，所以必然会读出乱码。1对3.
                // 字节一个读一个肯定就没办法读出一个完整的汉字
                //所以文本文件（纯汉字）应该用字符流。
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            fileInputStream.close();
        }


    }



    @Test
    public  void getHello3() throws IOException {
        String filename = "E:\\hello2.txt";//一个汉字3个字节，今天开始好好学习！！！
        int readData = 0;
        //定义字节数组
        byte[]  buff  = new byte[8];//一次读取8个字节

        FileInputStream fileInputStream = null;
        try {
            fileInputStream  = new FileInputStream(filename);
            while( (readData = fileInputStream.read(buff)) != -1 ){
//                System.out.println((char)readData);
                System.out.println(new String(buff,0,readData));
                //char是单个字节，所以必然会读出乱码。1对3.
                // 字节一个读一个肯定就没办法读出一个完整的汉字
                //所以文本文件（纯汉字）应该用字符流。
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            fileInputStream.close();
        }


    }
}
