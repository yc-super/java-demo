package MultiThread.ProducerAndCustomer;

public class Producer implements Runnable{
    private Box box;
    public Producer(Box box){
        this.box=box;
    }
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            box.put(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
