package zifuStream;

import zifuStream.Entity.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/*
* 将文件中学生信息封装到ArrayList中，并打印
*
* */
public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("src\\FileDemo\\arrayFile.txt"));
        ArrayList<Student> arrayList=new ArrayList<>();
        String line;
        while((line=br.readLine())!=null){
            String[] strArray=line.split(",");
            String id=strArray[0];
            String name=strArray[1];
            int age=Integer.parseInt(strArray[2]);
            Student student=new Student(id,name,age);
            arrayList.add(student);
        }
        for(Student stu:arrayList){
            System.out.println(stu);
        }
        br.close();
    }
}
