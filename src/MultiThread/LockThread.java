package MultiThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable{

    private static int tickect = 100;
    private Lock lock=new ReentrantLock();

    @Override
    public void run() {
        //同步代码块的方式解决安全问题
        while(true){
            lock.lock();
            if (tickect > 0) {
                System.out.println("这里是第" + Thread.currentThread().getName() + "窗口，余票为：" + tickect + "张，正在锁票");
                tickect--;
                System.out.println("这里是第" + Thread.currentThread().getName() + "窗口，出票成功，余票为：" + tickect + "张");
            }
            lock.unlock();
        }
    }
}
