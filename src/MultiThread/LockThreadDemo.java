package MultiThread;

public class LockThreadDemo {
    public static void main(String[] args) {
        LockThread thread=new LockThread();
        Thread t1=new Thread(thread);
        Thread t2=new Thread(thread);

        t1.start();
        t2.start();
    }
}
