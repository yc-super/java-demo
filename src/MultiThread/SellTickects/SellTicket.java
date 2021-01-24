package MultiThread.SellTickects;
/*
*使用synchronized解决线程安全问题有3中策略：
*   1. 同步代码块（对象锁），同步代码块的代码量越少，需要消耗的系统资源就越少
*   2. 同步方法块（对象锁）
*   3. 同步类方法（类锁，类是由ClassLoader类加载器实例化的对象，所以也是Class对象锁）
*
*
* */
public class SellTicket implements Runnable {
    private static int tickect = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        sellTicket();
        //同步代码块的方式解决安全问题
        /*while(true){
            synchronized(obj) {
                if (tickect > 0) {
                    System.out.println("这里是第" + Thread.currentThread().getName() + "窗口，余票为：" + tickect + "张，正在锁票");
                    tickect--;
                    System.out.println("这里是第" + Thread.currentThread().getName() + "窗口，出票成功，余票为：" + tickect + "张");
                }
            }
        }*/
    }

    //同步方法的方式解决安全问题，锁是this
    /*private synchronized void sellTicket() {
        while (true) {
            if (tickect > 0) {
                System.out.println("这里是第" + Thread.currentThread().getName() + "窗口，余票为：" + tickect + "张，正在锁票");
                tickect--;
                System.out.println("这里是第" + Thread.currentThread().getName() + "窗口，出票成功，余票为：" + tickect + "张");
            }
        }
    }*/

    //同步静态方法解决安全问题，锁是SellTicket.class，也就是 类名.class
    private static synchronized void sellTicket() {
        while (true) {
            if (tickect > 0) {
                System.out.println("这里是第" + Thread.currentThread().getName() + "窗口，余票为：" + tickect + "张，正在锁票");
                tickect--;
                System.out.println("这里是第" + Thread.currentThread().getName() + "窗口，出票成功，余票为：" + tickect + "张");
            }
        }
    }
}
