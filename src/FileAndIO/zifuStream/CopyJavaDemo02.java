package FileAndIO.zifuStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
* 利用改进版字符流复制文件
*
* */
public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("src\\FileAndIO\\FileDemo\\java.txt");
        FileWriter writer=new FileWriter("src\\FileAndIO\\FileDemo\\copy.txt");
        //一次读写一个字符
//        int ch;
//        while((ch=reader.read())!=-1){
//            writer.write(ch);
//        }
        //一次读写一个数组
        int len;
        char[] chs=new char[1024];
        while((len=reader.read(chs))!=-1){
            writer.write(chs);
        }
        writer.close();
        reader.close();
    }
}
