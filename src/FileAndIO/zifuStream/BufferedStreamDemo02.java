package FileAndIO.zifuStream;

import java.io.*;
/*
* 字符缓冲流读写文件
*
* */
public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src\\FileAndIO\\FileDemo\\java.txt",true)));
        for(int i=0;i<5;i++){
            bw.write("哈哈哈"+i);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        BufferedReader br=new BufferedReader(new FileReader("src\\FileAndIO\\FileDemo\\java.txt"));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
