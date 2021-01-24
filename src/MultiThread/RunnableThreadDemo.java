package MultiThread;

public class RunnableThreadDemo {
    public static void main(String[] args) {
        RunnableThread thread=new RunnableThread();
        Thread t1=new Thread(thread);
        Thread t2=new Thread(thread);

        t1.start();
        t2.start();
    }
}
