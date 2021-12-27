package com.lzx.io.read;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        //1.创建文件路径
        String filepath = "E:\\hello3.txt";
        FileReader fileReader = null;
        int read = 0;
        try {
             fileReader =  new FileReader(filepath);
             //第一种方法循环读取
             while((read = fileReader.read()) != -1){
                 System.out.println((char)read);
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
