package 反射.练习;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
/*
*           通过反射，读取配置文件中的信息，加载类并运行类中的方法
*
* */
public class ReflectProperties {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Properties pro=new Properties();
        FileReader fr=new FileReader("src/反射/练习/class.txt");
        pro.load(fr);

        System.out.println(pro.getProperty("className"));
        System.out.println(pro.getProperty("methodName"));

        Class<?> c = Class.forName(pro.getProperty("className"));
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Method m = c.getDeclaredMethod(pro.getProperty("methodName"),int.class);
        m.setAccessible(true);
        Object a=m.invoke(obj,3);
        System.out.println(a);
    }
}
