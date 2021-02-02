package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import static java.lang.Class.forName;
/*
*       反射获取成员变量，并使用
*
* */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = forName("反射.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        Field nameField = c.getDeclaredField("name");
        Field ageField = c.getDeclaredField("age");
        Field addressField = c.getDeclaredField("address");

        nameField.setAccessible(true);
        nameField.set(obj,"小明");
        ageField.set(obj,18);
        addressField.set(obj,"杭州");

        System.out.println(obj);
    }
}
