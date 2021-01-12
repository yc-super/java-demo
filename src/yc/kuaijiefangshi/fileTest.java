package yc.kuaijiefangshi;

import java.io.File;

public class fileTest {
    public static void main(String[] args) {

        //创建File对象
        File file = new File("D:\\1documents");
        //获取该目录下的所有文件
        String[] files = file.list();

        for (String f : files){
            System.out.println(f);
        }

        //listFiles是获取该目录下所有文件和目录的绝对路径
        File[] fs = file.listFiles();
        for (File f : fs){
            System.out.println(f);
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getPath());
            System.out.println(f.getAbsolutePath() instanceof String);
        }
    }

}
