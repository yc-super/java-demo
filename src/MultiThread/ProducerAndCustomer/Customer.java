package MultiThread.ProducerAndCustomer;

public class Customer implements Runnable{
    private Box box;

    public Customer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while(true){
            box.get();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
