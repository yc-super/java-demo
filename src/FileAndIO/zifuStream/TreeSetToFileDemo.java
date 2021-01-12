package FileAndIO.zifuStream;

import FileAndIO.zifuStream.Entity.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
/*
* 将输入的数据按照一定的顺序存入文件
*
* */
public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int sum=o1.getSum()-o2.getSum();
                int sum1=sum==0?o1.getChinese()-o2.getChinese():sum;
                int sum2=sum1==0?o1.getEnglish()-o2.getEnglish():sum1;
                int sum3=sum2==0?o1.getMath()-o2.getMath():sum2;
                return sum3;
            }
        });


        for(int i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入第"+(i+1)+"个学生信息：");
            System.out.println("姓名：");
            String name=sc.nextLine();
            System.out.println("语文成绩：");
            int chinese=sc.nextInt();
            System.out.println("英语成绩：");
            int english=sc.nextInt();
            System.out.println("数学成绩：");
            int math=sc.nextInt();
            Student student=new Student(name,chinese,english,math);
            ts.add(student);


        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("src\\FileAndIO\\FileDemo\\array2.txt"));
        for(Student student:ts){
            StringBuilder sb=new StringBuilder();
            sb.append(student.getName()).append(",").append(student.getChinese()).append(",").append(student.getEnglish()).append(",").append(student.getMath());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
    }
}
