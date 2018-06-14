package cn.vector.io.file;

import java.io.File;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-14 10:24
 */
public class FileDemo {
    public static void main(String[] args)throws Exception{
        //了解构造函数的情况 查帮助
        File file1 = new File("F:\\tmp\\vector");
        File file2 = new File("F:\\tmp\\vector\\test");
        System.out.println("目录file1是否存在:" + file1.exists());
        System.out.println("目录file2是否存在:" + file2.exists());
        if(!file2.exists()){
            System.out.println("目录file2不存在，则创建目录\"F:\\tmp\\vector\\test\"");
            file2.mkdir();
            System.out.println("目录file2是否存在:" + file2.exists());
        }else{
            System.out.println("目录file2存在，则删除目录");
            file2.delete();
            System.out.println("目录file2已被删除!!!");
            System.out.println("目录file2是否存在:" + file2.exists());
        }
        if(file2.exists()) {
            System.out.println("file2是否为目录 : " + file2.isDirectory());
            System.out.println("file2是否为文件 ：" + file2.isFile());
        }
        //两种方式
        //File file3 = new File("F:\\tmp\\vector\\日记1.txt");
        File file3 = new File("F:\\tmp\\vector", "日记1.txt");
        if(!file3.exists()){
            System.out.println("file3文件不存在,则创建一个新文件\"F:\\tmp\\vector\\日记1.txt\"!");
            file3.createNewFile();
        }else{
            System.out.println("file3文件存在，删除文件！");
            file3.delete();
            System.out.println("file3已被删除！");
        }
        if(file3.exists()) {
            System.out.println("file3是否为目录 : " + file3.isDirectory());
            System.out.println("file3是否为文件 ：" + file3.isFile());
        }
        File file4 = new File("F:\\tmp\\vector", "日记2.txt");
        if(!file4.exists()){
            System.out.println("file4文件不存在,则创建一个新文件\"F:\\tmp\\vector\\日记2.txt\"!");
            file4.createNewFile();
        }
        //常用的File对象的API
        System.out.println("####常用的File对象的API####");
        System.out.println("显示文件信息file.toString");
        System.out.println("目录：" + file1);
        System.out.println("文件：" + file4);
        System.out.println("file.getAbsolutePath()显示绝对路径");
        System.out.println(file4.getAbsolutePath());
        //System.out.println("file.getAbsoluteFile()显示绝对路径文件");
        //System.out.println(file4.getAbsoluteFile());
        System.out.println("file.getName()显示文件名");
        System.out.println(file4.getName());
        System.out.println("file.getParent()显示父目录");
        System.out.println(file4.getParent());

    }
}
