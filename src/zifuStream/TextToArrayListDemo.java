package zifuStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("array.txt"));
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
