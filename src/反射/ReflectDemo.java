package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/*
*       反射获取构造方法并使用
*
* */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取class对象
        Class<?> c = Class.forName("反射.Student");
        Constructor<?> con = c.getDeclaredConstructor(String.class);

        //一般来说，私有构造方法是不能创建对象的，但反射可以通过暴力反射，使用私有构造方法创建对象
        //public void setAccessiable(boolean flag)：值为ture时，取消访问检查
        con.setAccessible(true);

        Object obj = con.newInstance("小明");
        System.out.println(obj);
    }
}
