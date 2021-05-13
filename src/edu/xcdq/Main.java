package edu.xcdq;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	   File file= new File("E:\\classthree.txt");
	    File file1 = new File("e:/three.txt");
	    File file2 = new File("e:/ch10/demo01");
	    File file3=new File("e:/ch010");

	    try {
	        file.canExecute();
	        file1.canExecute();
	        /*file2.mkdirs();//创建多层文件
	        file3.mkdirs();//创建一层文件
	        file1.delete();//删除文件
	        file2.delete();//删除为空的那一级文件
	        file3.renameTo(new File("e:/ch0010"));//修改路径	*/
	        System.out.println(file.exists());
	        System.out.println(file.isFile());
	        System.out.println(file2.isDirectory());
	        System.out.println(file2.getPath());

        }catch (Exception e){
	        e.printStackTrace();
        }
    }
}
