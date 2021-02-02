package 反射.练习;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
/*
*       通过反射，向ArrayList<Integer>中添加String类型的元素
*
*
* */
public class ArrayString {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> array=new ArrayList<>();

        array.add(12);
        array.add(13);
//        array.add("cc");



        Class<? extends ArrayList> c = array.getClass();
        Method m = c.getMethod("add", Object.class);
        m.invoke(array,"你好");
        m.invoke(array,"Java");
        m.invoke(array,"world");


        System.out.println(array);
    }
}
