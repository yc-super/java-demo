package MultiThread;

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin t1=new ThreadJoin();
        ThreadJoin t2=new ThreadJoin();
        ThreadJoin t3=new ThreadJoin();

        t1.setName("康熙");
        t2.setName("四阿哥");
        t3.setName("五阿哥");

        t1.start();
        t1.join();
        t2.start();
        t3.start();
        System.out.println("结束");
    }
}
