package com.lzx.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {

    }


    /**
     * 讲文件写入
     */
    @Test
    public void writeFile(){
        //1.先创建对象
        String filePath = "E:\\hello3.txt";
        FileOutputStream  fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath);//创建方式，当写入内容是，会覆盖原来的内容
            // new FileOutputStream(filePath,true);//创建方式，当写入内容是，是追加到文件后面
            //写入一个字节
//            fileOutputStream.write('H');
            //写入一个字符串
            String str = "hello4444";
            //getBytes() 把字节串转换为字节数组
//            fileOutputStream.write(str.getBytes());
              fileOutputStream.write(str.getBytes(),0,str.length());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    /**
     * 从一个磁盘读取文件，复制到另一个磁盘
     */
    @Test
    public void copyFile() throws IOException {

        String filepath = "E:\\hello3.txt";
        String file = "F:\\hello3.txt";

        FileInputStream fileInputStream = null ;
        FileOutputStream fileOutputStream = null ;
        //定义一个字节组。提高读取效率
        byte[] buf = new byte[1024];
        int readLen = 0;
        try {
             fileInputStream = new FileInputStream(filepath);
             fileOutputStream = new FileOutputStream((file));
             while ( (readLen = fileInputStream.read(buf) ) != -1 ){
                 fileOutputStream.write(buf,0,buf.length);//一定要使用这个方法。一遍读一边写
             }
             System.out.println("拷贝OK！！！");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileInputStream !=null){
                fileInputStream.close();
            }
            if(fileOutputStream !=null){
                fileOutputStream.close();
            }
        }


    }

}
