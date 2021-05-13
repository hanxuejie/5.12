package edu.xcdq;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Author:hanxuejie
 * @Date:2021/5/13 17:32
 */

public class Demo02 {
    public static void main(String[] args) throws Exception{
        //准备输入输出流
        FileInputStream fi = new FileInputStream("E:\\Visual Studio Code.lnk");
        FileOutputStream fo = new FileOutputStream("D:\\des\\Visual Studio Code.lnk");

        int len=0;
        byte[] b= new byte[1024];
        while ((len=fi.read(b)) !=-1){
            fo.write(b);
        }
        fi.close();
        fo.close();

    }
}
