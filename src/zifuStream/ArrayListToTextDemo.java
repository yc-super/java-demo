package zifuStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTextDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("array.txt"));
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
