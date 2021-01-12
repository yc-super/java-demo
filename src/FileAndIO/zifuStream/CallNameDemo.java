package FileAndIO.zifuStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("src\\FileAndIO\\FileDemo\\StudentNameList"));
        ArrayList<String> array=new ArrayList<>();
        String line;
        while((line=br.readLine())!=null){
            array.add(line);
        }
        br.close();

        for (String str:array){
            System.out.println(str);
        }

        int i=new Random().nextInt(array.size());
        String name=array.get(i);
        System.out.println("幸运儿是："+name);
    }
}
