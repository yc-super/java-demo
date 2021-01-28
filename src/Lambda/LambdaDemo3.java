package Lambda;
/*
* Lambda表达式的省略模式
* */
public class LambdaDemo3 {
    public static void main(String[] args) {
        //参数类型可以省略。但是在多个参数的情况下，不能只省略一个
        //如果参数个数只有一个，那么小括号可以省略
        useInterface(x -> {
            System.out.println("x是："+x);
        });

        //如果代码块中的语句只有一条，可以省略大括号和分号；
        //如果代码块中的语句只有一条，并且有return，那么return也可省略
        useInterface(x -> System.out.println("x是："+x));
    }
    public static void useInterface(Interface i){
        i.show2(3);
    }
}
