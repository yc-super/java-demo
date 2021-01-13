package MultiThread;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        DaemonThread t1=new DaemonThread();
        DaemonThread t2=new DaemonThread();

        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();

//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName()+":"+i);
//        }
    }
}
