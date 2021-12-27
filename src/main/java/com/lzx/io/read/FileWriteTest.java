package com.lzx.io.read;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
    public static void main(String[] args) {
        //1.创建文件
        String filepath = "E:\\hello4.txt";
        FileWriter fileWriter = null;
        int read = 0;
        try {
            fileWriter =  new FileWriter(filepath);//默认覆盖方式，new FileWriter(filepath，true)这个才是不覆盖
            /**
             * 1. fileWriter.write(int),写入单个字符
             * 2.write(char[]),写入指定数组
             * 3.write(char[]，off，char。len)，写入指定数组的的指定部分
             * 4.write（String），写入数组的整个字符串
             */
            fileWriter.write('H');

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    /**
     * 单个字符文件，循环读取
     */
    @Test
    public void getRead(){
        //1.创建文件路径
        String filepath = "E:\\hello3.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] reads = new char[10];
        try {
            fileReader =  new FileReader(filepath);
            //第2种方法循环读取 reads
            while((readLen = fileReader.read(reads)) != -1){
                System.out.println(new String(reads,0,reads.length));
            }
            System.out.println("单个字符读完了！！！");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
