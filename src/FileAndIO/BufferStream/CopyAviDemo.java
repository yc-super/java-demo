package FileAndIO.BufferStream;

import java.io.*;
/*
* 比较字节流、字节缓冲流复制文件速度
*
* */
public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        Long startTime=System.currentTimeMillis();
        //1.基本字节流一次读写一个字节
//        method1();//122272
        //2.基本字节流一次读写一个数组
//        method2();//166
        //3.字节缓冲流一次读写一个字节
//        method3();//226
        //4.字节缓冲流一次读写一个数组
        method4();//42
        Long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
    //字节流，一次读写一个字节
    private static void method1() throws IOException {
        FileInputStream fis=new FileInputStream("src\\FileAndIO\\FileDemo\\video-demo.mp4");
        FileOutputStream fos=new FileOutputStream("src\\FileAndIO\\FileDemo\\video-copy.mp4");
        int len;
        while((len=fis.read())!=-1){
            fos.write(len);
        }
        fos.close();
        fis.close();
    }
    //字节流，一次读写一个数组
    private static void method2() throws IOException {
        FileInputStream fis=new FileInputStream("src\\FileAndIO\\FileDemo\\video-demo.mp4");
        FileOutputStream fos=new FileOutputStream("src\\FileAndIO\\FileDemo\\video-copy.mp4");
        byte[] bys=new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();
    }
    //字符缓冲流，一次读写一个字节
    private static void method3() throws IOException {
        FileInputStream fis=new FileInputStream("src\\FileAndIO\\FileDemo\\video-demo.mp4");
        FileOutputStream fos=new FileOutputStream("src\\FileAndIO\\FileDemo\\video-copy.mp4");
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        int len;
        while((len=bis.read())!=-1){
            bos.write(len);
        }
        bos.close();
        bis.close();
    }
    //字节缓冲流，一次读写一个数组
    private static void method4() throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("src\\FileAndIO\\FileDemo\\video-demo.mp4"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("src\\FileAndIO\\FileDemo\\video-copy.mp4"));
        int len;
        byte[] bys=new byte[1024];
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
}
