package FileAndIO.zifuStream;

import FileAndIO.zifuStream.Entity.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/*
* 将ArrayList中的学生信息利用字符缓冲流存储到文件中，每个学生的信息存储到一行
*
* */
public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("src\\FileAndIO\\FileDemo\\arrayFile.txt"));
        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(new Student("001","小明",13));
        arrayList.add(new Student("002","小红",14));
        arrayList.add(new Student("003","小黑",15));
        arrayList.add(new Student("004","小米",16));
        for(Student stu:arrayList){
            StringBuilder str=new StringBuilder();
            str=str.append(stu.getId()).append(",").append(stu.getName()).append(",").append(stu.getAge());
            bw.write(str.toString());
            bw.newLine();
        }
        bw.close();
    }
}
