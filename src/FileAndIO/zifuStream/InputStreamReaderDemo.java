package FileAndIO.zifuStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* 字符输入流练习
*
* */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("src\\FileAndIO\\FileDemo\\java.txt"));
        //一次读一个字符
//        int ch;
//        while((ch=isr.read())!=-1){
//            System.out.println((char)ch);
//        }
        //一次读一个
        int len;
        char[] chars=new char[1024];
        while((len=isr.read(chars))!=-1){
            System.out.println(new String(chars));
            System.out.println(new String(chars,0,1));
        }
        isr.close();
    }
}
