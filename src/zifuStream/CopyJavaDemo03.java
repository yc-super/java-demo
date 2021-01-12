package zifuStream;

import java.io.*;

public class CopyJavaDemo03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("src\\FileDemo\\java.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("src\\FileDemo\\java2.txt"));
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
