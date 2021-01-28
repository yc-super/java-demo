package Lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //1.无参无返回值
        //利用实现类
        InterfaceImpl a = new InterfaceImpl();
        useInterface(a);

        //匿名内部类
        useInterface2(new Interface() {

            @Override
            public void show2(int x) {
                System.out.println("x是："+x);
            }
        });

        //Lambda表达式(要求接口只能有一个抽象方法)
        useInterface2((int x)->{
            System.out.println("x是："+x);
        });
    }

    public static void useInterface(Interface i){
//        i.show();
    }
    public static void useInterface2(Interface i){
        i.show2(3);
    }
}
