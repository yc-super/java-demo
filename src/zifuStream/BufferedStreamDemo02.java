package zifuStream;

import java.io.*;

public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("java.txt",true)));
        for(int i=0;i<5;i++){
            bw.write("哈哈哈"+i);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        BufferedReader br=new BufferedReader(new FileReader("java.txt"));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
