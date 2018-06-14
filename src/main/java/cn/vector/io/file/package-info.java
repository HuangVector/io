/**
 * java.io.File类用于表示文件（目录）
 * File类只能用于表示文件（目录）的信息（名称、大小等），不能用于文件内容的访问
 *
 * RandomAccessFile java提供的对文件内容的访问， 既可以读文件， 也可以写文件。
 * RandomAccessFile 支持随机访问文件， 可以访问文件的任意位置
 *
 * (1)java文件模型
 *   在硬盘上的文件是byte byte byte存储的， 是数据的集合
 * (2)打开文件
 *   有两种模式"rw"(读写) "r"(只读)
 *   RandomAccessFile raf = new RandomAccessFile(file, "rw")
 *   文件指针， 打开文件时指针在开通 pointer = 0;
 * (3)写方法
 *   raf.write(int) --->只写一个字节(后8位), 同时指针指向下一个位置， 准备再次写入
 * (4)读方法
 *   int b = raf.read() --->读一个字节
 * (5)文件读写完成后一定要关闭
 *
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-14 10:20
 */
package cn.vector.io.file;