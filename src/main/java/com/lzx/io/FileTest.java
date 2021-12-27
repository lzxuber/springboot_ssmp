package com.lzx.io;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {

    }

    /**
     * 根据父目录文件+子路径构建
     */
    @Test
    public void filetest(){
        File parerntfile = new File("E:\\");
        String fileName = "study_io.txt";
        //这里的file对象，在java程序中，只是一个对象
        File file = new File(parerntfile,fileName);
        try {
            file.createNewFile();//只有执行了这个方法，才从内存上写到磁盘上（在磁盘上创建）
            System.out.println("study_io.txt文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 根据父目录+子路径构建
     */
    @Test
    public void filetest2(){
//        File parerntfile = new File("E:\\");
        String parerntfile = "E:\\";
//        String parerntfile = "E:/";
        String fileName = "study2_io.txt";
        //这里的file对象，在java程序中，只是一个对象
        File file = new File(parerntfile,fileName);
        try {
            file.createNewFile();//只有执行了这个方法，才从内存上写到磁盘上（在磁盘上创建）
            System.out.println("study_io.txt文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
