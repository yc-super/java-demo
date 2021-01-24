package MultiThread.SellTickects;
/*
* 出现安全问题的原因：
*   1. 是多线程环境
*   2. 有共享数据
*   3. 有多条语句操作共享数据
*   只要破坏其中一个条件，就不会出现安全问题，一般是破坏第3条
*   obj相当于一把锁，使得一段代码同时只能被一个线程使用
*
*
*
* */
public class SellTickectsDemo {
    public static void main(String[] args) {
        SellTicket ticket=new SellTicket();
        Thread t1=new Thread(ticket);
        Thread t2=new Thread(ticket);

        t1.start();
        t2.start();
    }
}
