package com.lzx.utils;

import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object Data;


    public R (Boolean flag,Object Data){
        this.flag = flag;
        this.Data = Data;
    }

    public R (Boolean flag){
         this.flag = flag;
    }

    public R (){

    }
}
