package Genericity;
/*
*   可变参数又称参数个数可变，用作方法的形参出现，那么方法参数的个数就是可变的了
*       格式：修饰符  返回值类型 方法名（数据类型... 变量名）{}
*       范例：public static void sum(int... a){}
*
*   可变参数注意事项：
*       这里的变量其实是一个数组
*       如果一个方法有多个参数，应该把可变参数放在最后（一个方法的参数中不能有多个可变参数）
*
*
* */
public class 可变参数 {
    public static void main(String[] args) {
        sum(1,2,3,4);
    }

    public static void sum2(int b,String... c){}


    public static void sum(int... a){
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        System.out.println(sum);
    }
}
