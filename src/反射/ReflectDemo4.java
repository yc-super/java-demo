package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 *       反射获取成员方法并使用
 *
 * */
public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("反射.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

//        Method[] methods = c.getMethods();
        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }


        Method m1 = c.getDeclaredMethod("method1", int.class);
        m1.setAccessible(true);

        Object a=m1.invoke(obj,3);
        System.out.println(a);

        Method m2 = c.getDeclaredMethod("method2", String.class);
//        m1.setAccessible(true);

        Object b=m2.invoke(obj,"3");
        System.out.println(b);

    }
}
