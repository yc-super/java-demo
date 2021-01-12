package FileAndIO.zifuStream;

import java.io.*;

public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("src\\FileAndIO\\FileDemo\\java.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
        osw.write("src\\FileAndIO\\FileDemo\\中国");
        osw.flush();

        FileInputStream fis=new FileInputStream("src\\FileAndIO\\FileDemo\\java.txt");
        InputStreamReader isr=new InputStreamReader(fis,"GBK");

        int ch;
        while((ch=isr.read())!=-1){
            System.out.println((char)ch);
        }
        osw.close();
        isr.close();
    }
}
