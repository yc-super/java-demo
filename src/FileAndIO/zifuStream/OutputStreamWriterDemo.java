package FileAndIO.zifuStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
/*
* 字符输出流练习
*
* */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("src\\FileAndIO\\FileDemo\\java.txt"));
//        osw.write(97);
//        osw.write(98);
//        osw.write(99);

        char[] chars={'a','b','c','d'};
//        osw.write(chars);

        osw.write(chars,0,3);

        String s="abcd";
//        osw.write(s);
//        osw.write(s,0,2);



        osw.close();

    }
}
