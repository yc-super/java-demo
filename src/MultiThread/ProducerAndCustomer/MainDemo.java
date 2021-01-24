package MultiThread.ProducerAndCustomer;

public class MainDemo {
    public static void main(String[] args) {
        Box box=new Box();
        Customer customer=new Customer(box);
        Producer producer=new Producer(box);
        Thread t1=new Thread(customer);
        Thread t2=new Thread(producer);

        t1.start();
        t2.start();
    }
}
