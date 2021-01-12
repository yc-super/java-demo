package FileAndIO.BufferedStream;

import java.io.*;

public class BufferedStreamDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("src\\FileAndIO\\FileDemo\\copy.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("src\\FileAndIO\\FileDemo\\java.txt"));
//        int ch;
//        while((ch=br.read())!=-1){
//            System.out.println((char)ch);
//        }
        int len;
        char[] chs=new char[1024];
        while((len=br.read(chs))!=-1){
            bw.write(chs,0,len);
        }
        bw.close();
        br.close();
    }
}
