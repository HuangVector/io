package cn.vector.io.file;

import java.io.File;
import java.io.IOException;

/**
 * 列出File的一些常用操作比如过滤、遍历等操作
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-14 11:51
 */
public class FileUtils {
    /**
     * 列出指定目录下（包括其子目录）的所有文件
     * @param dir 需要列出的目录
     * @throws IOException
     */
    public static void listDirectory(File dir) throws IOException{
        if(!dir.exists()){
            throw new IllegalArgumentException("目录：" + dir + "不存在。");
        }
        if(!dir.isDirectory()){
            throw  new IllegalArgumentException(dir + "不是目录");
        }
        /**
        String[] filenames = dir.list();
        for(String filename : filenames){
            System.out.println(dir + "\\" + filename);
        }
        */
        /**
         * 如果要遍历子目录下的内容就需要构造成File对象做递归操作
         * File提供了直接返回File对象数组
         */
        File[] files = dir.listFiles();
        if(files != null && files.length >0){
            for(File file : files){
                if(file.isDirectory()){
                    System.out.println("[dir]"+file);
                    //递归
                    listDirectory(file);
                }else{
                    System.out.println(file);
                }
            }
        }

    }
}
