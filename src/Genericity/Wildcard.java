package Genericity;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.ArrayList;
import java.util.List;
/*
* 类型通配符
* */
public class Wildcard {
    public static void main(String[] args) {
        List<?> list1=new ArrayList<Object>();
        List<?> list2=new ArrayList<Number>();
        List<?> list3=new ArrayList<Integer>();

        System.out.println("--------");

        //类型通配符上限
        List<? extends Number> list4=new ArrayList<Number>();
        List<? extends Number> list5=new ArrayList<Integer>();
//        List<? extends Number> list6=new ArrayList<Object>();//报错

        //类型通配符下限
//        List<? super Number> list7=new ArrayList<Integer>();//报错
        List<? super Number> list8=new ArrayList<Number>();
        List<? super Number> list9=new ArrayList<Object>();
    }
}
