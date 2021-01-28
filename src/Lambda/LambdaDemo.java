package Lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        //实现类的方式实现需求：启动一个多线程
       /* MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(my);
        t1.start();*/

        //匿名内部类的方式
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("一个线程启动了");
            }
        }).start();*/

        //Lambda表达式实现
        new Thread(()->{
            System.out.println("一个线程启动了");
        }).start();
    }
}
