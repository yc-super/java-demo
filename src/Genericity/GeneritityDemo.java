package Genericity;

import FileAndIO.zifuStream.Entity.Student;
/*
* 泛型类
* */
public class GeneritityDemo {
    public static void main(String[] args) {
        Geniricity<String> g1 = new Geniricity<>();
        g1.setT("小明");
        System.out.println(g1.getT());

        Geniricity<Integer> t2 = new Geniricity<>();
        t2.setT(13);
        System.out.println(t2.getT());

        Geniricity<Student> g3 = new Geniricity<>();
        g3.setT(new Student());
        System.out.println(g3.getT());

        System.out.println("--------");
        //泛型方法：
        g1.show("你好");
        g1.show(123);
        g1.show(new Student());
    }
}
