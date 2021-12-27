package com.lzx.io;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileContents {

    public static void main(String[] args) {

    }

    //判断文件是否存在，如果存在就删除
    @Test
    public void m1(){
//        String filePath = "E:\\hello.txt";
//
//        File file = new File(filePath);
//        if(file.exists()){
//            if(file.delete()){
//                System.out.println("文件删除成功");
//            }else {
//                System.out.println("文件删除不成功！！");
//            }
//        }else{
//            System.out.println("文件不存在！");
//               if( file.mkdirs() ){ //创建多层目录使用这个！！！！
//                   System.out.println("创建目录成功啊啊！");
//               }else{
//                   System.out.println("创建目录不成功！");
//               }
//
//        }


        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("w");
        list.add("e");
        for (int i=0;i<list.size();i++){ //0,1,2

            list.remove(i);
//            break;
//            System.out.println(list.get(i));
        }
        System.out.println(list.size());
        for (Object obj:list) {
            System.out.println(obj);
        }


    }

}
