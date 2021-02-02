package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/*
*       反射获取成员变量
*
* */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("反射.Student");
//        Field[] fields = c.getFields();
//        Field[] fields = c.getDeclaredFields();
//        for(Field f:fields){
//            System.out.println(f);
//        }

        Field addressField = c.getDeclaredField("address");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        addressField.set(obj,"杭州");
        System.out.println(obj);
    }
}
