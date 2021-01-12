package FileAndIO.zifuStream;

import java.io.*;
/*
* 利用字符缓冲流复制文件
*
* */
public class CopyJavaDemo03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("src\\FileAndIO\\FileDemo\\java.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("src\\FileAndIO\\FileDemo\\java2.txt"));
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
