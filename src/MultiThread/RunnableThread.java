package MultiThread;
/*
* 使用Runnable的好处:
*  1. 避免java单继承带来的局限
*  2. 适合多个相同程序代码的线程去处理同一资源，把线程同程序代码、数据分离开，较好的体现了面向对象的设计思想
*  3. 增强了代码的健壮性，代码能够被多个线程共享，代码与数据是独立的
*
* */
public class RunnableThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
