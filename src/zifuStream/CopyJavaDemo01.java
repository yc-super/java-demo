package zifuStream;

import java.io.*;

public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("java.txt"));
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("copy.txt"));

        //一次读写一个字符
//        int ch;
//        while((ch=isr.read())!=-1){
//            osw.write(ch);
//        }
        int len;
        char[] chs=new char[1024];
        while((len=isr.read(chs))!=-1){
            osw.write(chs);
        }
        osw.close();
        isr.close();
    }
}
