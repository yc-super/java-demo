package MultiThread;


public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();

        myThread1.setName("高铁");
        myThread2.setName("火车");
        System.out.println(myThread1.getPriority());//5
        System.out.println(myThread2.getPriority());//5

        //查看线程优先级
        System.out.println(Thread.MAX_PRIORITY);//10
        System.out.println(Thread.MIN_PRIORITY);//1
        System.out.println(Thread.NORM_PRIORITY);//5

        //更改线程的优先级
        //优先级从1到10，优先级逐渐升高
        //不是高优先级的线程就一定先比低优先级执行完，而是高优先级线程先执行的概率比低优先级的线程高。
//        myThread1.setPriority(100);//Exception in thread "main" java.lang.IllegalArgumentException，不合规的优先级
        myThread1.setPriority(5);
        myThread1.start();
        myThread2.start();

        System.out.println(Thread.currentThread().getName());
    }
}
