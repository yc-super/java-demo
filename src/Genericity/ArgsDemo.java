package Genericity;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
/*
* 可变参数的使用：
*       Arrays工具类中有一个静态方法，
*       public static <T> List<T> asList(T... a);//返回由指定数组支持的固定大小的list
*       在给元素时，可以给null
*       返回的集合不能做增删操作，可以修改（影响原数组）
*
*       List接口中有一个静态方法：
*       public static <E> List<E> of(E... elements);//返回包含任意数量元素的不可变list
*       在给元素时，不能给null
*       返回的集合不能做增删改操作
*
*       Set接口中有一个静态方法：
*       public static <E> Set<E> of(E... elements);//返回包含任意数量元素的不可变集合
*       在给元素的时候，由于Set的特性，不能给重复元素
*       返回的集合不能做增删操作，没有修改的方法
*
* */
public class ArgsDemo {
    public static void main(String[] args) {
        String[] str={"林青霞","张曼玉","刘亦菲"};
        List<String> list1= Arrays.asList(str);
//        list1.add("孙悟空");//UnsupportedOperationException
//        list1.remove("林青霞");//UnsupportedOperationException
        list1.set(1,"猪八戒");
        System.out.println(list1);
        System.out.println(Arrays.toString(str));//说明影响了原数组

//        List<String> list2=List.Of("林青霞","张曼玉","刘亦菲");//java9中的方法，我用的是java8，所以会报错
//        list2.add("孙悟空");//UnsupportedOperationException
//        list2.remove("林青霞");//UnsupportedOperationException
//        list2.set(1,"猪八戒");//UnsupportedOperationException
//        System.out.println(list2);

//        Set<String> set=Set.of("林青霞","张曼玉","刘亦菲");//java9中的方法，我用的是java8，所以会报错
//        set.add("孙悟空");//UnsupportedOperationException
//        set.remove("林青霞");//UnsupportedOperationException
//        System.out.println(set);
    }


}
