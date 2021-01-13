package MultiThread;

public class SleepThreadDemo {
    public static void main(String[] args) {
        SleepThread t1=new SleepThread();
        SleepThread t2=new SleepThread();

        t1.start();
        try {
            t1.join();//等t1执行完再执行别的线程
            //执行顺序：t1线程，main中别的代码比如最后的打印操作，t2线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        System.out.println("执行完毕所有线程");
    }
}
