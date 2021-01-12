package zifuStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/*
* 这个demo用于将文件中的内容取出来放到一个ArrayList中
* */
public class TextToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("src\\FileDemo\\array.txt"));
        ArrayList<String> array=new ArrayList<>();
        String line;
        while((line=br.readLine())!=null){
            array.add(line);
        }
        br.close();
        for(String str:array){
            System.out.println(str);
        }
    }
}
