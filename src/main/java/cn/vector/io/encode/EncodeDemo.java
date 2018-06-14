package cn.vector.io.encode;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-14 9:05
 */
public class EncodeDemo {
    public static void main(String[] args) throws Exception{
        String s = "慕课ABC";
        //转换成字节序列用的是项目默认的编码gbk
        byte[] bytes1 = s.getBytes();
        System.out.println(s);
        for(byte b : bytes1){
            //把字节（转换成了int）以2进制的方式显示
            if(Integer.toHexString(b).length() == 2){
                System.out.print("      "+Integer.toHexString(b) + " ");
            }else{
                System.out.print(Integer.toHexString(b) + " ");
            }

        }
        System.out.println();
        for(byte b : bytes1){
            //把字节（转换成了int）以16进制的方式显示
            System.out.print("      " + Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();
        System.out.println("************************** GBK ***************************");
        byte[] bytes2 = s.getBytes("gbk");

        //gbk编码中文占用2个字节， 英文占用1个字节
        for(byte b : bytes2){
            if(Integer.toHexString(b).length() == 2){
                System.out.print("      "+Integer.toHexString(b) + " ");
            }else {
                System.out.print(Integer.toHexString(b) + " ");
            }
        }
        System.out.println();
        for(byte b : bytes2){
           System.out.print("      " + Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();

        System.out.println("*************************** utf-8 ************************");

        byte[] bytes3 = s.getBytes("utf-8");

        //utf8编码中文占用3个字节， 英文占用1个字节
        for(byte b : bytes3){
            if(Integer.toHexString(b).length() == 2){
                System.out.print("      "+Integer.toHexString(b) + " ");
            }else {
                System.out.print(Integer.toHexString(b) + " ");
            }
        }
        System.out.println();
        for(byte b : bytes3){
           System.out.print("      " + Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();

        System.out.println("*************************** utf-16be ************************");

        byte[] bytes4 = s.getBytes("utf-16be");

        //utf8编码中文占用2个字节， 英文占用2个字节
        for(byte b : bytes4){
            if(Integer.toHexString(b).length() == 2 || Integer.toHexString(b).length() == 1  ){
                System.out.print("      "+Integer.toHexString(b) + " ");
            }else{
                System.out.print(Integer.toHexString(b) + " ");
            }
        }
        System.out.println();
        for(byte b : bytes4){
           System.out.print("      " + Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();
        /**
         * 当你的字节序列式某种编码时， 这个时候想把字节序列变成
         * 字符串， 也需要用这种编码方式， 否则会出现乱码
         */

        System.out.println("******************用默认编码显示*************************");
        String str1 = new String(bytes1);
        String str2 = new String(bytes2);
        String str3 = new String(bytes3);
        String str4 = new String(bytes4);
        System.out.println("默认编码 : " + str1);
        System.out.println("GBK    :  " + str2);
        System.out.println("UTF8   :  "+str3);
        System.out.println("UTF16be:  "+str4);
        System.out.println("****************** GBK *************************");
        String str11 = new String(bytes1,"gbk");
        String str21 = new String(bytes2,"gbk");
        String str31 = new String(bytes3,"gbk");
        String str41 = new String(bytes4,"gbk");
        System.out.println("默认编码 : " + str11);
        System.out.println("GBK    :  " + str21);
        System.out.println("UTF8   :  "+str31);
        System.out.println("UTF16be:  "+str41);
        System.out.println("******************UTF-16be*************************");
        String str12 = new String(bytes1,"utf-16be");
        String str22 = new String(bytes2,"utf-16be");
        String str32 = new String(bytes3,"utf-16be");
        String str42 = new String(bytes4,"utf-16be");
        System.out.println("默认编码 : " + str12);
        System.out.println("GBK    :  " + str22);
        System.out.println("UTF8   :  "+str32);
        System.out.println("UTF16be:  "+str42);
        /**
         * 文本文件 就是字节序列
         * 可以是任意编码的字节序列
         * 如果我们在中文机器上直接创建文本文件，那么该文本文件只认识ansi编码
         * 联通、联这是一种巧合，他们正好符合了utf-8编码的规则
         */

    }
}
