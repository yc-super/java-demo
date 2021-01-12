package FileAndIO.BufferStream;

import java.io.*;
/*
* 字节缓冲流读写文件
*
* */
public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("src\\FileAndIO\\FileDemo\\java.txt"));
        bos.write("hello ".getBytes());
        bos.write("world\r\n".getBytes());
//        bos.close();
        bos.flush();
        BufferedInputStream bis= new BufferedInputStream(new FileInputStream("src\\FileAndIO\\FileDemo\\java.txt"));
        byte[] bys=new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }
        bos.close();
        bis.close();

    }
}
