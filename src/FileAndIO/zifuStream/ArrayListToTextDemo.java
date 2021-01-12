package FileAndIO.zifuStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/*
* 这个demo用于将arrayList中的元素利用字符缓冲流放到文件中，每一个元素放一行
*
*
* */
public class ArrayListToTextDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("src\\FileAndIO\\FileDemo\\array.txt"));
        ArrayList<String> array=new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");
        for(String str:array){
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }
}
